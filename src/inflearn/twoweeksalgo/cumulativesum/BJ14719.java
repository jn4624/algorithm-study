package inflearn.twoweeksalgo.cumulativesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  ******* 누적합 *******
  백준 - 빗물
  https://www.acmicpc.net/problem/14719
 */
public class BJ14719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[] height = new int[w];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < w; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int[] prefix = new int[w];
        int[] suffix = new int[w];

        prefix[0] = height[0];
        for (int i = 1; i < w; i++) {
            prefix[i] = Math.max(prefix[i - 1], height[i]);
        }

        suffix[w - 1] = height[w - 1];
        for (int i = w - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], height[i]);
        }

        int answer = 0;
        for (int i = 1; i < w - 1; i++) {
            int temp = Math.min(prefix[i], suffix[i]) - height[i];
            if (temp > 0) {
                answer += temp;
            }
        }

        System.out.println(answer);
    }
}
