package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  문자열 압축
 */
public class Problem11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine() + " ";

        System.out.println(solution(input));
    }

    private static String solution(String input) {
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length() -1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                cnt++;
            } else {
                sb.append(input.charAt(i));
                if (cnt > 1) {
                    sb.append(cnt);
                    cnt = 1;
                }
            }
        }
        return sb.toString();
    }
}
