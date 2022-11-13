package firstweek.BonusProblems1_1.Bonus3;

import java.util.Scanner;

public class FigureProblem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("점 (x, y)의 좌표를 입력하시오>> ");
            int x = Integer.parseInt(scan.next());
            int y = Integer.parseInt(scan.next());
            if ((100 <= x && x <= 200) && (100 <= y && y <= 200)) {
                System.out.printf("(%d, %d)는 안에 있습니다.\n", x, y);
            } else {
                System.out.printf("(%d, %d)는 밖에 있습니다.\n", x, y);
            }
        }
    }
}
