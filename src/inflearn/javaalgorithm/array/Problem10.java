package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  봉우리
 */
public class Problem10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] array = new int[n + 2][n + 2];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= n; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution1(n, array));
    }

    private static int solution1(int n, int[][] array) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int target = array[i][j];
                int top = array[i - 1][j];
                int bottom = array[i + 1][j];
                int left = array[i][j - 1];
                int right = array[i][j + 1];

                if (target > top && target > bottom && target > left && target > right) {
                    answer++;
                }
            }
        }
        return answer;
    }

    private static int solution2(int n, int[][] array) {
        int answer = 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                boolean isAnswer = true;
                for (int k = 0; k < dx.length; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (array[i][j] <= array[nx][ny]) {
                        isAnswer = false;
                        break;
                    }
                }

                if (isAnswer) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
