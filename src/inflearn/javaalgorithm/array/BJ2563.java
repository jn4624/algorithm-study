package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  색종이
  https://www.acmicpc.net/problem/2563
 */
public class BJ2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n, br));
    }

    private static int solution(int n, BufferedReader br) throws IOException {
        int[][] array = new int[101][101];
        int answer = 0;
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int row = Integer.parseInt(input[0]);
            int col = Integer.parseInt(input[1]);

            int cnt = 0;
            for (int j = row; j < row + 10; j++) {
                for (int k = col; k < col + 10; k++) {
                    if (array[j][k] == 0) {
                        array[j][k] = 1;
                        cnt++;
                    }
                }
            }
            answer += cnt;
        }
        return answer;
    }
}
