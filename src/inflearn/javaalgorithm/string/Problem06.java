package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  중복 문자 제거
 */
public class Problem06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    private static StringBuilder solution(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == input.indexOf(input.charAt(i))) {
                sb.append(input.charAt(i));
            }
        }
        return sb;
    }
}
