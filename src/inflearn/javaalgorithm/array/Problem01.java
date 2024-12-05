package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  큰 수 출력하기
 */
public class Problem01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(array, n));
    }

    private static String solution(int[] array, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]).append(" ");
        for (int i = 1; i < n; i++) {
            if (array[i - 1] < array[i]) {
                sb.append(array[i]).append(" ");
            }
        }
        return sb.toString();
    }
}
