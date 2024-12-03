package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
  듣보잡
  https://www.acmicpc.net/problem/1764
 */
public class BJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        }

        List<String> list = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (map.containsKey(input)) {
                list.add(input);
                cnt++;
            }
        }

        Collections.sort(list);

        System.out.println(cnt);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
