package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
  괄호
  https://www.acmicpc.net/problem/9012
 */
public class BJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            System.out.println(solution(input));
        }
    }

    private static String solution(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        String answer = "YES";
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else  {
                if (stack.isEmpty()) {
                    answer = "NO";
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            answer = "NO";
        }
        return answer;
    }
}
