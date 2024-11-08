package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 정수론 *******
  백준 - 청기 백기
  https://www.acmicpc.net/problem/15736
 */
public class BJ15736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int answer = (int) Math.sqrt(count);
        System.out.println(answer);
    }
}
