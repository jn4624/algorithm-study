package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  팰린드롬수
  https://www.acmicpc.net/problem/1259
 */
public class BJ1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        while (!(input = br.readLine()).equals("0")) {
            System.out.println(solution2(input));
        }
    }

    private static String solution1(String input) {
        String tmp = new StringBuilder(input).reverse().toString();
        return tmp.equals(input) ? "yes" : "no";
    }

    private static String solution2(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return "no";
            }
            start++;
            end--;
        }
        return "yes";
    }
}
