package inflearn.twoweeksalgo.cumulativesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  ******* 누적합 *******
  백준 - 개똥벌레
  https://www.acmicpc.net/problem/3020
 */
public class BJ3020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int[] line = new int[h];

        for (int i = 0; i < n; i++) {
            int height = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                line[0] += 1;
                if (height < h) {
                    line[height] -= 1;
                }
            } else {
                line[h - height] += 1;
            }
        }

        int[] prefix = new int[h + 1];
        for (int i = 0; i < h; i++) {
            prefix[i + 1] = prefix[i] + line[i];
        }

        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 1; i <= h; i++) {
            if (prefix[i] < min) {
                min = prefix[i];
                count = 1;
            } else if (prefix[i] == min) {
                count++;
            }
        }

        System.out.println(min + " " + count);
    }
}
