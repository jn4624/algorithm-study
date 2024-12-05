package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  피보나치 수열
 */
public class Problem04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int number : solution1(n)) {
            System.out.print(number + " ");
        }
    }

    private static int[] solution1(int n) {
        int[] prefix = new int[n];
        prefix[0] = 1;
        prefix[1] = 1;

        for (int i = 2; i < n; i++) {
            prefix[i] = prefix[i - 2] + prefix[i - 1];
        }
        return prefix;
    }

    private static String solution2(int n) {
        int a = 1;
        int b = 1;
        int c;

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ")
                .append(b).append(" ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            sb.append(c).append(" ");
            a = b;
            b = c;
        }
        return sb.toString();
    }
}
