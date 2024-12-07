package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  임시반장 정하기
 */
public class Problem11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] array = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, array));
    }

    private static int solution(int n, int[][] array) {
        int max = Integer.MIN_VALUE;
        int answer = 0;
        for (int i = 1; i <= n; i++) { // 학생
            int cnt = 0;
            for (int j = 1; j <= n; j++) { // 학년
                for (int k = 1; k <= 5; k++) {
                    if (array[i][k] == array[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}
