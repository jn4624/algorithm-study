package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  가위바위보
 */
public class Problem03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arrayA = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {
            arrayA[j] = Integer.parseInt(st.nextToken());
        }

        int[] arrayB = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {
            arrayB[j] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution1(n, arrayA, arrayB));
    }

    private static String solution1(int n, int[] arrayA, int[] arrayB) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int valueA = arrayA[i];
            int valueB = arrayB[i];

            if (valueA == 1) { // 가위
                if (valueB == 1) {
                    sb.append("D");
                } else if (valueB == 2) {
                    sb.append("B");
                } else {
                    sb.append("A");
                }
            } else if (valueA == 2) { // 바위
                if (valueB == 1) {
                    sb.append("A");
                } else if (valueB == 2) {
                    sb.append("D");
                } else {
                    sb.append("B");
                }
            } else { // 보
                if (valueB == 1) {
                    sb.append("B");
                } else if (valueB == 2) {
                    sb.append("A");
                } else {
                    sb.append("D");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static String solution2(int n, int[] arrayA, int[] arrayB) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int valueA = arrayA[i];
            int valueB = arrayB[i];

            if (valueA == valueB) {
                sb.append("D");
            } else if (valueA == 1 && valueB == 3) {
                sb.append("A");
            } else if (valueA == 2 && valueB == 1) {
                sb.append("A");
            } else if (valueA == 3 && valueB == 2) {
                sb.append("A");
            } else {
                sb.append("B");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
