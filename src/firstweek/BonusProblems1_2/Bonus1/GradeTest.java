package firstweek.BonusProblems1_2.Bonus1;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
        int mathScore = scan.nextInt();
        int scienceScore = scan.nextInt();
        int englishScore = scan.nextInt();

        Grade me = new Grade(mathScore, scienceScore, englishScore);
        System.out.println("평균은 " + me.scoreAverage());

        scan.close();
    }
}
