package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  암호
 */
public class Problem12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String input = br.readLine();

        System.out.println(solution(cnt, input));
    }

    private static String solution(int cnt, String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            String tmp = input.substring(0, 7)
                    .replace("#", "1")
                    .replace("*", "0");
            sb.append((char) Integer.parseInt(tmp, 2));
            input = input.substring(7);
        }
        return sb.toString();
    }
}
