package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  회문 문자열(펠린드롬)
 */
public class Problem07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution1(input));
    }

    private static String solution1(String input) {
        input = input.toLowerCase();

        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return "NO";
            }
        }
        return "YES";
    }

    private static String solution2(String input) {
        String tmp = new StringBuilder(input).reverse().toString();

        if (!input.equalsIgnoreCase(tmp)) {
            return "NO";
        }
        return "YES";
    }
}
