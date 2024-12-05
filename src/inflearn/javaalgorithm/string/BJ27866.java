package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  문자와 문자열
  acmicpc.net/problem/27866
 */
public class BJ27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(input, n));
    }

    private static char solution(String input, int n) {
        return input.charAt(n - 1);
    }
}
