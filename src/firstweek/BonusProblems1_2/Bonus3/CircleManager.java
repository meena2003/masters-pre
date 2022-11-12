package firstweek.BonusProblems1_2.Bonus3;

import java.util.Scanner;

public class CircleManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circles[] = new Circle[3];// 3개의 Circle 배열 선언

        for (int i = 0; i < 3; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();// x값 읽기.
            double y = scanner.nextDouble();// y값 읽기.
            int radius = scanner.nextInt();// radius값 읽기.
            circles[i] = new Circle(x, y, radius);// Circle 객체 생성
        }

        for (int i = 0; i < circles.length; i++) {
            circles[i].show();
            System.out.println(); // 출력
        }
        scanner.close();
    }
}
