package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
  세로읽기
  https://www.acmicpc.net/problem/10798
 */
public class BJ10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = new String[5];
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            max = Math.max(max, input.length());
            inputs[i] = input;
        }

        System.out.println(solution1(max, inputs));
    }

    private static String solution1(int max, String[] inputs) {
        StringBuilder sb = new StringBuilder();
        char[][] array = new char[5][max];
        for (int i = 0; i < 5; i++) {
            Arrays.fill(array[i], ' ');
        }
        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[i].length(); j++) {
                array[i][j] = inputs[i].charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[j][i] == ' ') {
                    continue;
                }
                sb.append(array[j][i]);
            }
        }
        return sb.toString();
    }

    private static String solution2(String[] inputs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (inputs[j].length() > i) {
                    sb.append(inputs[j].charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
