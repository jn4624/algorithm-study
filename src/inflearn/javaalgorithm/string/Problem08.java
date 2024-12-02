package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  유효한 팰린드롬
 */
public class Problem08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        input = input.replaceAll("[^A-Za-z]", "");
        String tmp = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(tmp) ? "YES" : "NO";
    }
}
