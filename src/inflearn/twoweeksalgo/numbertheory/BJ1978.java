package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  ******* 정수론 *******
  백준 - 소수 찾기
  https://www.acmicpc.net/problem/1978
 */
public class BJ1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int answer = 0;
        for (int i = 0; i < count; i++) {
            int number = Integer.parseInt(st.nextToken());
            boolean isPrime = true;
            if (number <= 1) continue;

            for (int j = 2; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                answer += 1;
            }
        }

        System.out.println(answer);
    }
}
