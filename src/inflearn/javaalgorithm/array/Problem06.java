package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  뒤집은 소수
 */
public class Problem06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] stringArray = new String[n];
        int[] intArray = new int[n];
        for (int i = 0; i < n; i++) {
            String input = st.nextToken();
            stringArray[i] = input;
            intArray[i] = Integer.parseInt(input);
        }

        System.out.println(solution1(stringArray));
        System.out.println(solution2(intArray));
    }

    private static String solution1(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (String s : array) {
            s = new StringBuilder(s).reverse().toString();
            int tmp = Integer.parseInt(s);
            if (tmp < 2) continue;
            boolean isPrime = true;

            for (int i = 2; i < tmp; i++) {
                if (tmp % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sb.append(tmp).append(" ");
            }
        }
        return sb.toString();
    }

    private static String solution2(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            int tmp = 0;
            while (i > 0) {
                int t = i % 10;
                tmp = tmp * 10 + t;
                i = i / 10;
            }

            if (tmp < 2) continue;

            boolean isPrime = true;
            for (int j = 2; j < tmp; j++) {
                if (tmp % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sb.append(tmp).append(" ");
            }
        }

        return sb.toString();
    }
}
