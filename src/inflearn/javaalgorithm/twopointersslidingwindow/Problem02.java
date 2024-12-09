package inflearn.javaalgorithm.twopointersslidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
  공통원소 구하기
 */
public class Problem02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arrayA = createArray(n, br);

        int m = Integer.parseInt(br.readLine());
        int[] arrayB = createArray(m, br);

        System.out.println(solution(arrayA, arrayB, n, m));
    }

    private static String solution(int[] arrayA, int[] arrayB, int n, int m) {
        int pointA = 0;
        int pointB = 0;

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        StringBuilder sb = new StringBuilder();
        while (pointA < n && pointB < m) {
            if (arrayA[pointA] < arrayB[pointB]) {
                pointA++;
            } else if (arrayA[pointA] > arrayB[pointB]) {
                pointB++;
            } else {
                sb.append(arrayA[pointA++]).append(" ");
                pointB++;
            }
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
