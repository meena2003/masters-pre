package firstweek.algorithm.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int number = Integer.parseInt(br.readLine());
        int[] arraryScores = getArrayScores(number);
        printScore(arraryScores);
        br.close();
    }

    private static int[] getArrayScores(int number) throws IOException {
        int[] arrayScores = new int[number];
        for (int i = 0; i < number; i++) {
            arrayScores[i] = getScoreOfcase();
        }
        return arrayScores;
    }

    private static int getScoreOfcase() throws IOException {
        String[] OXCase = br.readLine().split("");
        int score = calculaterScore(OXCase);
        return score;
    }

    private static int calculaterScore(String[] OXCase) {
        int score = 0;
        int sumScore = 0;
        for (int i = 0; i < OXCase.length; i++) {
            String icon = OXCase[i];
            if (isX(icon)) {
                score = 0;
                continue;
            }
            sumScore += ++score;
        }
        return sumScore;
    }

    private static boolean isX(String icon) {
        return icon.equals("X") ? true : false;
    }

    private static void printScore(int[] arrayScores) {
        for (int score : arrayScores) {
            System.out.println(score);
        }
    }
}
