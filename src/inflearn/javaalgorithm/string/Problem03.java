package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  문장 속 단어
 */
public class Problem03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution2(input));
    }

    private static String solution1(String input) {
        int max = Integer.MIN_VALUE;
        String answer = "";
        for (String s : input.split(" ")) {
            if (s.length() > max) {
                max = s.length();
                answer = s;
            }
        }
        return answer;
    }

    private static String solution2(String input) {
        int pos;
        int max = Integer.MIN_VALUE;
        String answer = "";
        while ((pos = input.indexOf(" ")) != -1) {
            String tmp = input.substring(0, pos);

            if (tmp.length() > max) {
                max = tmp.length();
                answer = tmp;
            }

            input = input.substring(pos + 1);
        }
        return input.length() > max ? input : answer;
    }
}
