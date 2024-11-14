package inflearn.twoweeksalgo.cumulativesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

/*
  ******* 누적합 *******
  백준 - 직각다각형
  https://www.acmicpc.net/problem/17611
 */
public class BJ17611 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> horizontal = new HashMap<>();
        Map<Integer, Integer> vertical = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[(i + 1) % n][0];
            int y2 = points[(i + 1) % n][1];

            if (y1 == y2) {
                int start = Math.min(x1, x2) + 1;
                int end = Math.max(x1, x2);
                horizontal.put(start, horizontal.getOrDefault(start, 0) + 1);
                horizontal.put(end + 1, horizontal.getOrDefault(end + 1, 0) - 1);
            } else if (x1 == x2) {
                int start = Math.min(y1, y2) + 1;
                int end = Math.max(y1, y2);
                vertical.put(start, vertical.getOrDefault(start, 0) + 1);
                vertical.put(end + 1, vertical.getOrDefault(end + 1, 0) - 1);
            }
        }

        int maxHorizontal = getMax(horizontal);
        int maxVertical = getMax(vertical);

        System.out.println(Math.max(maxHorizontal, maxVertical));
    }

    public static int getMax(Map<Integer, Integer> crossings) {
        System.out.println("crossings = " + crossings);
        int max = Integer.MIN_VALUE;
        int current = 0;

        for (Integer key : new TreeSet<>(crossings.keySet())) {
            current += crossings.get(key);
            max = Math.max(max, current);
        }
        return max;
    }
}
