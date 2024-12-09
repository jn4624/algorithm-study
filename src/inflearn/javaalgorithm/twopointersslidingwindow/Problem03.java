package inflearn.javaalgorithm.twopointersslidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  최대 매출
 */
public class Problem03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(k, n, array));
    }

    private static int solution(int k, int n, int[] array) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }

        int answer = sum;
        for (int i = k; i < n; i++) {
            sum += array[i];
            sum -= array[i - k];

            answer = Math.max(answer, sum);
        }

        return answer;
    }
}
