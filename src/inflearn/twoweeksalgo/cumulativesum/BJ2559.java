package inflearn.twoweeksalgo.cumulativesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  ******* 누적합 *******
  백준 - 수열
  https://www.acmicpc.net/problem/2559
 */
public class BJ2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int temperature = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int[] prefix = new int[temperature + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < temperature; i++) {
            prefix[i + 1] = prefix[i] + Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;
        for (int i = day; i < temperature + 1; i++) {
            max = Math.max(max, prefix[i] - prefix[i - day]);
        }

        System.out.println(max);
    }
}
