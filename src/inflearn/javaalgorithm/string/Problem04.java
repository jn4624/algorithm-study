package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
  단어 뒤집기
 */
public class Problem04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            words[i] = br.readLine();
        }

        for (String answer : solution3(count, words)) {
            System.out.println(answer);
        }
    }

    private static String[] solution1(int count, String[] words) {
        String[] answers = new String[count];
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = words[i].length() - 1; j >= 0; j--) {
                sb.append(words[i].charAt(j));
            }
            answers[i] = sb.toString();
        }
        return answers;
    }

    private static List<String> solution2(int count, String[] words) {
        List<String> answers = new ArrayList<>();
        for (String word : words) {
            String answer = new StringBuilder(word).reverse().toString();
            answers.add(answer);
        }
        return answers;
    }

    private static List<String> solution3(int count, String[] words) {
        List<String> answers = new ArrayList<>();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            int lt = 0;
            int rt = word.length() - 1;

            while (lt < rt) {
                char tmp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = tmp;
                lt++;
                rt--;
            }

            answers.add(String.valueOf(charArray));
        }
        return answers;
    }
}
