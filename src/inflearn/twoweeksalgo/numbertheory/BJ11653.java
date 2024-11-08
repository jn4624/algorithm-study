package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 정수론 *******
  백준 - 소인수분해
  https://www.acmicpc.net/problem/11653
 */
public class BJ11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                number /= i;
                System.out.println(i);
            }
        }
    }
}
