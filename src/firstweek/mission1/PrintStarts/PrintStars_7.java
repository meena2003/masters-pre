package firstweek.mission1.PrintStarts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStars_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 위 삼각형
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i * 2 + 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래 삼각형
        for (int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < num * 2 - (i * 2) - 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
