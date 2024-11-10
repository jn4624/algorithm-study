package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 정수론 *******
  백준 - 다음 소수
  https://www.acmicpc.net/problem/4134
 */
public class BJ4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tCase; i++) {
            long input = Long.parseLong(br.readLine());

            if (input <= 1) {
                sb.append(2).append("\n");
                continue;
            }

            long condition = input;
            while (true) {
                if (isPrime(condition)) {
                    sb.append(condition).append("\n");
                    break;
                }
                condition++;
            }
        }

        System.out.println(sb);
    }

    public static boolean isPrime(long number) {
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0) return false;

        for (long i = 3; i * i <= number; i+= 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
