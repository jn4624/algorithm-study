package inflearn.javaalgorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  점수 계산
 */
public class Problem07 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        System.out.println(solution(n, input));
    }

    private static int solution(int n, String input) {
        int answer = 0;
        int tmp = 0;

        input = input.replace(" ", "");
        for (int i = 0; i < n; i++) {
            if (input.charAt(i) == '1') {
                tmp++;
                answer += tmp;
            } else {
                tmp = 0;
            }
        }
        return answer;
    }
}
