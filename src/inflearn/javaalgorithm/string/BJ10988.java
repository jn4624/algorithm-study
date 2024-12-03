package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  팰린드롬인지 확인하기
  https://www.acmicpc.net/problem/10988
 */
public class BJ10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    private static int solution(String input) {
        return (input.equals(new StringBuilder(input).reverse().toString())) ? 1 : 0;
    }
}
