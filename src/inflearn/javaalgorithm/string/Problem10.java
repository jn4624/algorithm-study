package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  가장 짧은 문자거리
 */
public class Problem10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        String s = inputs[0];
        String t = inputs[1];
        for (int i : solution(s, t)) {
            System.out.print(i + " ");
        }
    }

    private static int[] solution(String s, String t) {
        int[] answer = new int[s.length()];

        int distance = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(t)) {
                distance = 0;
            } else {
                distance++;
            }
            answer[i] = distance;
        }

        distance = 1000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (answer[i] == 0) {
                distance = 0;
            } else {
                distance++;
                answer[i] = Math.min(answer[i], distance);
            }
        }

        return answer;
    }
}
