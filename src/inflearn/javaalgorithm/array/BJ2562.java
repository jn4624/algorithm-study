package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
  최댓값
  https://www.acmicpc.net/problem/2562
 */
public class BJ2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(solution(br));
    }

    private static String solution(BufferedReader br) throws IOException {
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            int tmp = Integer.parseInt(br.readLine());
            max = Math.max(max, tmp);
            map.put(tmp, i + 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(map.get(max));
        return sb.toString();
    }
}
