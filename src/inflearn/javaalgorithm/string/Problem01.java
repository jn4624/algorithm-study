package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  문자 찾기
 */
public class Problem01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char findWord = br.readLine().charAt(0);

        System.out.println(solution(input, findWord));
    }

    private static int solution(String input, char findWord) {
        input = input.toLowerCase();
        findWord = Character.toLowerCase(findWord);

        int answer = 0;
        for (char c : input.toCharArray()) {
            if (c == findWord) {
                answer += 1;
            }
        }
        return answer;
    }
}
