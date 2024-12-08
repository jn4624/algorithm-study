package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  최댓값
  https://www.acmicpc.net/problem/2566
 */
public class BJ2566 {
    private static final int N = 9;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solution(br));
    }

    private static String solution(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int tmp = Integer.parseInt(st.nextToken());

                if (tmp > max) {
                    max = tmp;
                    row = i;
                    col = j;
                }
            }
        }
        sb.append(max).append("\n")
                .append(row).append(" ").append(col);
        return sb.toString();
    }
}
