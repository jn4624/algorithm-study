package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
  바구니 뒤집기
  https://www.acmicpc.net/problem/10811
 */
public class BJ10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(solution1(n, m, br));
    }

    private static String solution1(int n, int m, BufferedReader br) throws IOException {
        int[] answers = new int[n];
        for (int i = 0; i < n; i++) {
            answers[i] = (i + 1);
        }

        for (int i = 0; i < m; i++) {
            String[] inputs = br.readLine().split(" ");
            int iNum = Integer.parseInt(inputs[0]);
            int jNum = Integer.parseInt(inputs[1]);

            List<Integer> tmp = new ArrayList<>();
            for (int j = jNum; j >= iNum; j--) {
                tmp.add(answers[j - 1]);
            }

            int index = 0;
            for (int j = iNum; j <= jNum; j++) {
                answers[j - 1] = tmp.get(index++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int answer : answers) {
            sb.append(answer).append(" ");
        }
        return sb.toString();
    }

    private static String solution2(int n, int m, BufferedReader br) throws IOException {
        Integer[] answers = new Integer[n];
        for (int i = 0; i < n; i++) {
            answers[i] = (i + 1);
        }

        List<Integer> list = null;
        for (int i = 0; i < m; i++) {
            String[] inputs = br.readLine().split(" ");
            int iNum = Integer.parseInt(inputs[0]);
            int jNum = Integer.parseInt(inputs[1]);

            list = Arrays.asList(answers);
            Collections.reverse(list.subList(iNum - 1, jNum));
        }

        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i).append(" ");
        }
        return sb.toString();
    }
}
