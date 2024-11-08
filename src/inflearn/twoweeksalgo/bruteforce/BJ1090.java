package inflearn.twoweeksalgo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
  ******* 완전탐색 *******
  백준 - 체커
  https://www.acmicpc.net/problem/1090
 */
public class BJ1090 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int checkerCount = Integer.parseInt(br.readLine());
        int[][] checkers = new int[checkerCount][2];

        for (int i = 0; i < checkerCount; i++) {
            String[] inputs = br.readLine().split(" ");
            checkers[i][0] = Integer.parseInt(inputs[0]);
            checkers[i][1] = Integer.parseInt(inputs[1]);
        }

        int[] answers = new int[checkerCount];
        Arrays.fill(answers, Integer.MAX_VALUE);

        for (int[] x : checkers) {
            for (int[] y : checkers) {
                int[] moveCounts = new int[checkerCount];

                for (int i = 0; i < checkerCount; i++) {
                    moveCounts[i] = Math.abs(x[0] - checkers[i][0])
                            + Math.abs(y[1] - checkers[i][1]);
                }

                Arrays.sort(moveCounts);
                int sum = 0;
                for (int i = 0; i < checkerCount; i++) {
                    sum += moveCounts[i];
                    answers[i] = Math.min(sum, answers[i]);
                }
            }
        }

        for (int answer : answers) {
            System.out.print(answer + " ");
        }
    }
}
