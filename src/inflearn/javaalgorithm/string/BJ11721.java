package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  열 개씩 끊어 출력하기
  https://www.acmicpc.net/problem/11721
 */
public class BJ11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution1(input));
    }

    private static String solution1(String input) {
        StringBuilder sb = new StringBuilder();
        while (input.length() > 0) {
            int index;
            if (input.length() > 10) {
                index = 10;
            } else {
                index = input.length();
            }
            String tmp = input.substring(0, index);
            input = input.substring(index);
            sb.append(tmp).append("\n");
        }
        return sb.toString();
    }
}
