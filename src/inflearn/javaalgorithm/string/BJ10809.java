package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  알파벳 찾기
  https://www.acmicpc.net/problem/10809
 */
public class BJ10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] alphas = solution(input);
        for (int alpha : alphas) {
            System.out.print(alpha + " ");
        }
    }

    private static int[] solution(String input) {
        int[] alphas = new int[26];
        for (int i = 0; i < alphas.length; i++) {
            alphas[i] = -1;
        }
        // A: 65, a: 97
        for (char c : input.toCharArray()) {
            if (alphas[c - 97] == -1) {
                alphas[c - 97] = input.indexOf(c);
            }
        }
        return alphas;
    }
}
