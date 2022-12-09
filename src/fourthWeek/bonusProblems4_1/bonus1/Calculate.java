package fourthWeek.bonusProblems4_1.bonus1;

import firstweek.BonusProblems1_2.Bonus1.Grade;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Point point = new Point();

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> ");
        String grades = scan.nextLine();
        String[] gradesArray = grades.split(" ");

        for (int i = 0; i < gradesArray.length; i++) {
            switch (gradesArray[i]) {
                case "A":
                    point.addGrade(Point.Grade.A);
                    break;
                case "B":
                    point.addGrade(Point.Grade.B);
                    break;
                case "C":
                    point.addGrade(Point.Grade.C);
                    break;
                case "D":
                    point.addGrade(Point.Grade.D);
                    break;
                case "F":
                    point.addGrade(Point.Grade.F);
                    break;
            }
        }

        System.out.println(point.getAverage());
    }
}
