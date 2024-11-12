package inflearn.twoweeksalgo.cumulativesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
  ******* 누적합 *******
  백준 - 창고 다각형
  https://www.acmicpc.net/problem/2304
 */
public class BJ2304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tCase = Integer.parseInt(br.readLine());

        int[] graph = new int[1001];
        int maxWidth = Integer.MIN_VALUE;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < tCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x] = y;

            maxWidth = Math.max(maxWidth, x);
            maxHeight = Math.max(maxHeight, y);
        }

        int[] prefix = new int[maxWidth + 2];
        int[] suffix = new int[maxWidth + 2];
        List<Integer> maxPoint = new ArrayList<>();

        int h = Integer.MIN_VALUE;
        for (int i = 1; i < maxWidth + 1; i++) {
            if (graph[i] == maxHeight) {
                maxPoint.add(i);
                break;
            }
            h = Math.max(h, graph[i]);
            prefix[i] = prefix[i - 1] + h;
        }

        h = Integer.MIN_VALUE;
        for (int i = maxWidth; i > 0; i--) {
            if (graph[i] == maxHeight) {
                maxPoint.add(i);
                break;
            }
            h = Math.max(h, graph[i]);
            suffix[i] = suffix[i + 1] + h;
        }

        int answer = Arrays.stream(prefix).max().orElse(0) +
                Arrays.stream(suffix).max().orElse(0) +
                (maxPoint.get(1) - maxPoint.get(0) + 1) * maxHeight;

        System.out.println(answer);
    }
}
