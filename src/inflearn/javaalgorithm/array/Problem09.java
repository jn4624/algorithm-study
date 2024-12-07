package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  격자판 최대합
 */
public class Problem09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, array));
    }

    private static int solution(int n, int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < n; j++) {
                row += array[i][j];
                col += array[j][i];
            }
            max = Math.max(Math.max(max, row), col);
        }

        int leftCross = 0;
        int rightCross = 0;
        for (int i = 0; i < n; i++) {
            leftCross += array[i][i];
            rightCross += array[i][(n - i) - 1];
        }
        max = Math.max(Math.max(max, leftCross), rightCross);
        return max;
    }
}
