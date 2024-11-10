package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
  ******* 정수론 *******
  백준 - 공약수열
  https://www.acmicpc.net/problem/14252
 */
public class BJ14252 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(br.readLine());
        int[] numbers = new int[tCase];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < tCase; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        int answer = 0;
        for (int i = 0; i < tCase - 1; i++) {
            int a = numbers[i];
            int b = numbers[i + 1];

            if (gcd(a, b) == 1) {
                continue;
            }

            for (int j = a; j < b; j++) {
                if (gcd(a, j) == 1) {
                    if (gcd(b, j) == 1) {
                        answer += 1;
                        break;
                    }
                }

                if (j == b - 1) {
                    answer += 2;
                    break;
                }
            }
        }

        System.out.println(answer);
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return b;
    }
}
