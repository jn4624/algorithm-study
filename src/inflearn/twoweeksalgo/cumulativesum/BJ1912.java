package inflearn.twoweeksalgo.cumulativesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 누적합 *******
  백준 - 연속합
  https://www.acmicpc.net/problem/1912
 */
public class BJ1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        String[] splits = br.readLine().split(" ");
        int[] prefix = new int[number + 1];
        for (int i = 0; i < number; i++) {
            prefix[i + 1] = Math.max(prefix[i] + Integer.parseInt(splits[i]), Integer.parseInt(splits[i]));
        }

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < number + 1; i++) {
            max = Math.max(max, prefix[i]);
        }

        System.out.println(max);
    }
}
