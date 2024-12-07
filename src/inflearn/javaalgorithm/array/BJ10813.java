package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  공 바꾸기
  https://www.acmicpc.net/problem/10813
 */
public class BJ10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(solution(n, m, br));

    }

    private static String solution(int n, int m, BufferedReader br) throws IOException {
        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            answers[i] = (i + 1);
        }

        for (int i = 0; i < m; i++) {
            String[] inputs = br.readLine().split(" ");
            int iNum = Integer.parseInt(inputs[0]);
            int jNum = Integer.parseInt(inputs[1]);

            int tmp = answers[iNum - 1];
            answers[iNum - 1] = answers[jNum - 1];
            answers[jNum - 1] = tmp;
        }

        StringBuilder sb = new StringBuilder();
        for (int answer : answers) {
            sb.append(answer).append(" ");
        }
        return sb.toString();
    }
}
