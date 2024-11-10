package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  ******* 정수론 *******
  백준 - 배수와 약수
  https://www.acmicpc.net/problem/5086
 */
public class BJ5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            if (left == 0 && right == 0) break;

            if (left % right == left) {
                sb.append("factor").append("\n");
            } else if (left % right == 0) {
                sb.append("multiple").append("\n");
            } else {
                sb.append("neither").append("\n");
            }
        }

        System.out.println(sb);
    }
}
