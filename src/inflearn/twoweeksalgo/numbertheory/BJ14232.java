package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 정수론 *******
  백준 - 보석 도둑
  https://www.acmicpc.net/problem/14232
 */
public class BJ14232 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long weight = Long.parseLong(br.readLine());

        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= Math.sqrt(weight); i++) {
            while (weight % i == 0) {
                count += 1;
                sb.append(i).append(" ");
                weight /= i;
            }
        }

        if (weight > 1) {
            sb.append(weight);
            count += 1;
        }

        System.out.println(count);
        System.out.println(sb);
    }
}
