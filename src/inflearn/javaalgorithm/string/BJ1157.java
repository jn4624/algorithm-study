package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  단어 공부
  https://www.acmicpc.net/problem/1157
 */
public class BJ1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char answer = solution(input);
        System.out.println(answer);
    }

    private static char solution(String input) {
        input = input.toUpperCase();

        int[] alphas = new int[26];
        for (int i = 0; i < input.length(); i++) {
            alphas[input.charAt(i) - 65]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < alphas.length; i++) {
            if (alphas[i] == max) {
                answer = '?';
            } else if (alphas[i] > max) {
                max = alphas[i];
                answer = (char) (i + 65);
            }
        }
        return answer;
    }
}
