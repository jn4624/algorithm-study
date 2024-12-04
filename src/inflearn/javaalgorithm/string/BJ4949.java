package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
  균형잡힌 세상
  https://www.acmicpc.net/problem/4949
 */
public class BJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }

            System.out.println(solution1(input));
        }
    }

    private static String solution1(String input) {
        input = input.replace(" ", "");
        Deque<Character> deque = new ArrayDeque<>();
        String answer = "yes";
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[') {
                deque.push(c);
            } else if (c == ')' || c == ']') {
                if (deque.isEmpty()) {
                    answer = "no";
                } else {
                    if ((c == ')' && deque.peek() == '(') || (c == ']' && deque.peek() == '[')) {
                        deque.pop();
                    } else {
                        deque.push(c);
                    }
                }
            }
        }

        if (!deque.isEmpty()) {
            answer = "no";
        }
        return answer;
    }

    private static String solution2(String input) {
        char[] stack = input.toCharArray();
        int top = 0;

        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == '(' || stack[i] == '[') {
                stack[top++] = stack[i];
            } else if (stack[i] == ')') {
                if (top == 0 || stack[top - 1] != '(') {
                    return "no";
                }
                top--;
            } else if (stack[i] == ']') {
                if (top == 0 || stack[top - 1] != '[') {
                    return "no";
                }
                top--;
            }
        }
        return (top == 0) ? "yes" : "no";
    }
}
