package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 정수론 *******
  백준 - 약수들의 합
  https://www.acmicpc.net/problem/9506
 */
public class BJ9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (input == -1) break;

            int sum = 1;
            StringBuilder sb = new StringBuilder();
            sb.append(input).append(" = ");
            sb.append(1);

            for (int i = 2; i <= input / 2; i++) {
                if (input % i == 0) {
                    sum += i;
                    sb.append(" + ").append(i);
                }
            }

            if (sum == input) {
                System.out.println(sb);
            } else {
                System.out.println(input + " is NOT perfect.");
            }
        }
    }
}
