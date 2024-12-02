package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  숫자만 추출
 */
public class Problem09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution1(input));
    }

    private static int solution1(String input) {
        String answer = "";
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                answer += c;
            }
        }
        return Integer.parseInt(answer);
    }

    /*
      0: 아스키코드 48
      9: 아스키코드 57
     */
    private static int solution2(String input) {
        int answer = 0;
        for (char c : input.toCharArray()) {
            if (c >= 48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }
        return answer;
    }
}
