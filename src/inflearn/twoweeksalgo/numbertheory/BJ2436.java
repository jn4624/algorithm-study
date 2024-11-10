package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
  ******* 정수론 *******
  백준 - 공약수
  https://www.acmicpc.net/problem/2436
 */
public class BJ2436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int gcdInput = Integer.parseInt(st.nextToken());
        int lcmInput = Integer.parseInt(st.nextToken());
        int tCase = lcmInput / gcdInput;

        List<int[]> numbers = new ArrayList<>();
        int[] results = new int[2];

        for (int i = 1; i * i <= tCase; i++) {
            if (tCase % i == 0) {
                int temp = tCase / i;

                if (gcd(i, temp) == 1) {
                    numbers.add(new int[]{gcdInput * i, gcdInput * temp});
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int[] number : numbers) {
            int sum = number[0] + number[1];
            if (sum < min) {
                min = sum;
                results = number;
            }
        }

        System.out.println(results[0] + " " + results[1]);
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
