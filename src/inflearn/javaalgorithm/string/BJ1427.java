package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
  소트인사이드
  https://www.acmicpc.net/problem/1427
 */
public class BJ1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        char[] array = input.toCharArray();
        Arrays.sort(array);
        return new StringBuilder(new String(array)).reverse().toString();
    }
}
