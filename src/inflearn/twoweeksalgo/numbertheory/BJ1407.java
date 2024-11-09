package inflearn.twoweeksalgo.numbertheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
  ******* 정수론 *******
  백준 - 2로 몇번 나누어질까
  https://www.acmicpc.net/problem/1407
 */
public class BJ1407 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long numberA = Long.parseLong(st.nextToken());
        long numberB = Long.parseLong(st.nextToken());

        numberA--;
        long tmpA = numberA;
        for (int i = 1; i < 100; i++) {
            tmpA += (numberA / (long) Math.pow(2, i)) * ((long) Math.pow(2, i) - (long) Math.pow(2, i - 1));
        }

        long tmpB = numberB;
        for (int i = 1; i < 100; i++) {
            tmpB += (numberB / (long) Math.pow(2, i)) * ((long) Math.pow(2, i) - (long) Math.pow(2, i - 1));
        }

        System.out.println(tmpB - tmpA);
    }
}
