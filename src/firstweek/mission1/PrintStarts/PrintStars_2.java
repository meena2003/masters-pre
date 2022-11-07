package firstweek.mission1.PrintStarts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStars_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i < num + 1; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int x = 1; x < i + 1; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}