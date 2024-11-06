package inflearn.twoweeksalgo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 완전탐색 *******
  백준 - 암호 키
  https://www.acmicpc.net/problem/1816
 */
public class BJ1816 {
    public static final int limit = 1_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            long encryptKey = Long.parseLong(br.readLine());

            for (int j = 2; j <= limit; j++) {
                /*
                  암호 키의 모든 소인수가 limit 의 소인수에 포함된다면,
                  암호 키의 모든 소인수가 limit 보다 크지 않은 경우이므로
                  적절한 암호 키에 해당되지 않는다.
                 */
                if (encryptKey % j == 0) {
                    System.out.println("NO");
                    break;
                }

                if (j == limit) {
                    System.out.println("YES");
                }
            }
        }
    }
}
