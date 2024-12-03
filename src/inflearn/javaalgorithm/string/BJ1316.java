package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  그룹 단어 체커
  https://www.acmicpc.net/problem/1316
 */
public class BJ1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = n;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            cnt -= solution(input);
        }
        System.out.println(cnt);
    }

    private static int solution(String input) {
        int answer = 0;
        for (int j = 0; j < input.length(); j++) {
            int index = input.indexOf(input.charAt(j));
            if (index != j) {
                if (input.charAt(j - 1) != input.charAt(j)) {
                    answer = 1;
                    break;
                }
            }
        }
        return answer;
    }
}
