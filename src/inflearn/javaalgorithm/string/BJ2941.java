package inflearn.javaalgorithm.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  크로아티아 알파벳
  https://www.acmicpc.net/problem/2941
 */
public class BJ2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] croatiaAlphas = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (String croatiaAlpha : croatiaAlphas) {
            if (input.indexOf(croatiaAlpha) != -1) {
                input = input.replace(croatiaAlpha, "A");
            }
        }

        System.out.println(input.length());
    }
}
