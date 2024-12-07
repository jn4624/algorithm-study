package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  멘토링
 */
public class Problem12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution(n, m, array));
    }

    private static int solution(int n, int m, int[][] array) {
        int answer = 0;
        for (int i = 1; i <= n; i++) { // 멘토
            for (int j = 1; j <= n; j++) { // 멘티
                int cnt = 0;
                for (int k = 0; k < m; k++) { // 테스트
                    int mentor = 0;
                    int mentee = 0;
                    for (int l = 0; l < n; l++) { // 등수
                        if (array[k][l] == i) {
                            mentor = l;
                        }
                        if (array[k][l] == j) {
                            mentee = l;
                        }
                    }

                    if (mentor < mentee) {
                        cnt++;
                    }
                }

                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
