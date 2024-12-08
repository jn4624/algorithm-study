package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  행렬 덧셈
  https://www.acmicpc.net/problem/2738
 */
public class BJ2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arrayA = new int[n][m];
        int[][] arrayB = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arrayA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arrayB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution1(n, m, arrayA, arrayB));
        System.out.println(solution2(n, br, m, arrayA));
    }

    private static String solution1(int n, int m, int[][] arrayA, int[][] arrayB) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append((arrayA[i][j] + arrayB[i][j])).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static String solution2(int n, BufferedReader br, int m, int[][] arrayA) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arrayA[i][j] += Integer.parseInt(st.nextToken());
                sb.append(arrayA[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
