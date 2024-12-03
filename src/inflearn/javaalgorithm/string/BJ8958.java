package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  OX퀴즈
  https://www.acmicpc.net/problem/8958
 */
public class BJ8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine() + " ";
            int sum = solution(input);
            System.out.println(sum);
        }
    }

    private static int solution(String input) {
        int sum = 0;
        int cnt = 1;

        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == 'O') {
                if (input.charAt(j) == input.charAt(j + 1)) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                sum += cnt;
            }
        }
        return sum;
    }
}
