package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  잃어버린 괄호
  https://www.acmicpc.net/problem/1541
 */
public class BJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(solution(input));
    }

    private static int solution(String input) {
        String[] subNums = input.split("-");
        int min = Integer.MAX_VALUE;
        for (String subNum : subNums) {
            int tmp = 0;
            String[] addNums = subNum.split("\\+");

            for (String addNum : addNums) {
                tmp += Integer.parseInt(addNum);
            }

            if (min == Integer.MAX_VALUE) {
                min = tmp;
            } else {
                min -= tmp;
            }
        }
        return min;
    }
}
