package inflearn.twoweeksalgo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 완전탐색 *******
  백준 - 2017 연세대학교 프로그래밍 경시대회
  https://www.acmicpc.net/problem/14568
 */
public class BJ14568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int candy = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int a = 1; a <= candy; a++) { // 택희
            for (int b = 1; b <= candy; b++) { // 영훈
                for (int c = 1; c <= candy; c++) { // 남규
                    // 남는 사탕은 없어야 한다.
                    if (a + b + c == candy) {
                        // 남규는 영훈이보다 2개 이상 많은 사탕을 가져야 한다.
                        if (c >= b + 2) {
                            // 셋 중 사탕을 0개 받는 사람은 없어야 한다.
                            if (a != 0 && b != 0 && c != 0) {
                                // 택희가 받는 사탕의 수는 홀수개가 되어서는 안 된다.
                                if (a % 2 == 0) {
                                    answer += 1;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
