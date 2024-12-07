package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
  최소, 최대
  https://www.acmicpc.net/problem/10818
 */
public class BJ10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(solution1(n, st));
    }

    private static String solution1(int n, StringTokenizer st) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(st.nextToken());
            min = Math.min(min, input);
            max = Math.max(max, input);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        return sb.toString();
    }

    private static String solution2(int n, StringTokenizer st) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        StringBuilder sb = new StringBuilder();
        sb.append(array[0]).append(" ").append(array[n - 1]);
        return sb.toString();
    }
}
