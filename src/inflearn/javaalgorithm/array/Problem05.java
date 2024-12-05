package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  소수(에라토스테네스 체)
 */
public class Problem05 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution2(n));
    }

    private static int solution1(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                answer++;
            }
        }
        return answer;
    }

    private static int solution2(int n) {
        int answer = 0;
        int[] prefix = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            if (prefix[i] == 0) {
                answer++;
            }

            for (int j = i; j <= n; j += i) {
                prefix[j] = 1;
            }
        }

        return answer;
    }
}
