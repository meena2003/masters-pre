package firstweek.mission1.PrintStarts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStars_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < i * 2 + 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
