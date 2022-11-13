package firstweek.BonusProblems1_1.Bonus4;

import java.util.Scanner;

public class FigureProblem2 {
    static final int RECT_X1 = 100;
    static final int RECT_Y1 = 100;
    static final int RECT_X2 = 200;
    static final int RECT_Y2 = 200;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("직사각형 (x1, y1), (x2, y2)의 좌표를 입력하시오>> ");
            int x1 = Integer.parseInt(scan.next());
            int y1 = Integer.parseInt(scan.next());
            int x2 = Integer.parseInt(scan.next());
            int y2 = Integer.parseInt(scan.next());

            if (isInRect(x1, x2) && isInRect(y1, y2)) {
                System.out.printf("직사각형 (%d, %d), (%d, %d)는 사격형 안에 있습니다.\n", x1, x2, y1, y2);
            } else {
                System.out.printf("직사각형 (%d, %d), (%d, %d)는 사격형 밖에 있습니다.\n", x1, x2, y1, y2);
            }
            System.out.println();
        }
    }

    private static boolean isInRect(int x, int y) {
        if ((RECT_X1 <= x && x <= RECT_X2) && (RECT_Y1 <= y && y <= RECT_Y2)) {
            return true;
        }
        return false;
    }
}
