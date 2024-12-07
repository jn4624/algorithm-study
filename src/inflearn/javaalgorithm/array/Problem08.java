package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  등수구하기
 */
public class Problem08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        System.out.println(solution(n, input));
    }

    private static String solution(int n, String input) {
        StringBuilder sb = new StringBuilder();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(input.split(" ")[i]);
        }

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (array[i] < array[j]) {
                    rank++;
                }
            }
            sb.append(rank).append(" ");
        }
        return sb.toString();
    }
}
