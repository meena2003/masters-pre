package firstweek.BonusProblems1_1.Bonus2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static firstweek.algorithm.problems.Problem5.br;

public class NumberGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number;

        while (true) {
            System.out.print("1~99 사이의 정수를 입력하시오>> ");
            number = br.readLine();

            if (number.equalsIgnoreCase("Quit".trim())) {
                System.out.println("게임이 종료됩니다.");
                break;
            }
            System.out.println(getClap(number));
        }
    }
    private static String getClap(String number) {
        String clap = "박수";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '3' || number.charAt(i) == '6' || number.charAt(i) == '9') {
                clap += "짝";
            }
        }
        return clap;
    }
}
