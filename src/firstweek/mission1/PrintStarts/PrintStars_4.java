package firstweek.mission1.PrintStarts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintStars_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            for (int z = 0; z < i; z++) {
                System.out.print(" ");
            }
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
