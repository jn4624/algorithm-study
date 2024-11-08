package inflearn.twoweeksalgo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
  ******* 완전탐색 *******
  백준 - 숫자 야구
  https://www.acmicpc.net/problem/2503
 */
public class BJ2503 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int hintCount = Integer.parseInt(br.readLine());
        List<Hint> hints = new ArrayList<>();

        for (int i = 0; i < hintCount; i++) {
            String[] strList = br.readLine().split(" ");
            hints.add(new Hint(strList[0], Integer.parseInt(strList[1]), Integer.parseInt(strList[2])));
        }

        int answer = 0;
        for (int a = 1; a < 10; a++) { // 100의 자리
            for (int b = 1; b < 10; b++) { // 10의 자리
                for (int c = 1; c < 10; c++) { // 1의 자리
                    // 서로 다른 세 자리 수로 구성되어 있으니 같은 수가 존재하면 패스
                    if (a == b || b == c || c == a) {
                        continue;
                    }

                    int count = 0;

                    for (Hint hint : hints) {
                        int number = Integer.parseInt(hint.number);
                        int strike = hint.strike;
                        int ball = hint.ball;

                        int strikeCount = 0;
                        int ballCount = 0;

                        if (number / 100 == a) {
                            strikeCount += 1;
                        } else if (number / 100 == b || number / 100 == c) {
                            ballCount += 1;
                        }

                        if ((number % 100) / 10 == b) {
                            strikeCount += 1;
                        } else if ((number % 100) / 10 == a || (number % 100) / 10 == c) {
                            ballCount += 1;
                        }

                        if (number % 10 == c) {
                            strikeCount += 1;
                        } else if (number % 10 == a || number % 10 == b) {
                            ballCount += 1;
                        }

                        if (strike == strikeCount && ball == ballCount) {
                            count += 1;
                        }
                    }

                    if (count == hintCount) {
                        answer += 1;
                    }
                }
            }
        }

        System.out.println(answer);
    }

    static class Hint {
        String number;
        int strike;
        int ball;

        public Hint(String number, int strike, int ball) {
            this.number = number;
            this.strike = strike;
            this.ball = ball;
        }
    }
}
