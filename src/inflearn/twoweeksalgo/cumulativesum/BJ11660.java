package inflearn.twoweeksalgo.cumulativesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  ******* 누적합 *******
  백준 - 구간 합 구하기 5
  https://www.acmicpc.net/problem/11660
 */
public class BJ11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arrayCount = Integer.parseInt(st.nextToken());
        int answerCount = Integer.parseInt(st.nextToken());
        int[][] array = new int[arrayCount + 1][arrayCount + 1];

        for (int i = 1; i <= arrayCount; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= arrayCount; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] prefix = new int[arrayCount + 1][arrayCount + 1];
        for (int i = 1; i <= arrayCount; i++) {
            for (int j = 1; j <= arrayCount; j++) {
                prefix[i][j] = prefix[i][j - 1] + prefix[i - 1][j] - prefix[i - 1][j - 1] + array[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < answerCount; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int temp = prefix[x2][y2] - prefix[x2][y1 - 1] - prefix[x1 - 1][y2] + prefix[x1 - 1][y1 - 1];
            sb.append(temp).append("\n");
        }

        System.out.println(sb);
    }
}
