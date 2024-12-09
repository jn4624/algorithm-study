package inflearn.javaalgorithm.twopointersslidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  두 배열 합치기
 */
public class Problem01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrayA = createArray(n, br);

        int m = Integer.parseInt(br.readLine());
        int[] arrayB = createArray(m, br);

        System.out.println(solution(n, m, arrayA, arrayB));
    }

    private static String solution(int n, int m, int[] arrayA, int[] arrayB) {
        int pointA = 0;
        int pointB = 0;
        StringBuilder sb = new StringBuilder();
        while (pointA < n && pointB < m) {
            if (arrayA[pointA] <= arrayB[pointB]) {
                sb.append(arrayA[pointA++]);
            } else {
                sb.append(arrayB[pointB++]);
            }
            sb.append(" ");
        }

        while (pointA < n) {
            sb.append(arrayA[pointA++]).append(" ");
        }

        while (pointB < m) {
            sb.append(arrayB[pointB++]).append(" ");
        }
        return sb.toString();
    }

    private static int[] createArray(int count, BufferedReader br) throws IOException {
        int[] array = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        return array;
    }
}
