package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 정수론 *******
  백준 - 실질적 약수
  https://www.acmicpc.net/problem/2247
 */
public class BJ2247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long number = Integer.parseInt(br.readLine());

        long tmp = 0;
        for (int i = 2; i < number; i++) {
            tmp += ((number / i) - 1) * i;
        }

        System.out.println(tmp % 1_000_000);
    }
}
