package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  공 넣기
  https://www.acmicpc.net/problem/10810
 */
public class BJ10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(solution(n, m, br));
    }

    private static String solution(int n, int m, BufferedReader br) throws IOException {
        int[] answers = new int[n + 1];
        for (int i = 0; i < m; i++) {
            String[] inputs = br.readLine().split(" ");
            int start = Integer.parseInt(inputs[0]);
            int end = Integer.parseInt(inputs[1]);
            int value = Integer.parseInt(inputs[2]);

            for (int j = start; j <= end; j++) {
                answers[j] = value;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < answers.length; i++) {
            sb.append(answers[i]).append(" ");
        }
        return sb.toString();
    }
}
