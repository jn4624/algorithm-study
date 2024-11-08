package inflearn.twoweeksalgo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  ******* 완전탐색 *******
  백준 - 수학은 비대면강의입니다
  https://www.acmicpc.net/problem/19532
 */
public class BJ19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] integerStrList = br.readLine().split(" ");
        Integers integers = new Integers(integerStrList[0], integerStrList[1], integerStrList[2],
                integerStrList[3], integerStrList[4], integerStrList[5]);

        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if ((integers.a * x) + (integers.b * y) == integers.c
                    && (integers.d * x) + (integers.e * y) == integers.f) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }

    static class Integers {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        public Integers(String a, String b, String c, String d, String e, String f) {
            this.a = Integer.parseInt(a);
            this.b = Integer.parseInt(b);
            this.c = Integer.parseInt(c);
            this.d = Integer.parseInt(d);
            this.e = Integer.parseInt(e);
            this.f = Integer.parseInt(f);
        }
    }
}
