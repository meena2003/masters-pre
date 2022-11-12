package firstweek.BonusProblems1_2.Bonus4;

import java.util.Scanner;

public class CircleManager {
    private static Circle circles[] = new Circle[3];// 3개의 Circle 배열 선언

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();// x값 읽기.
            double y = scanner.nextDouble();// y값 읽기.
            int radius = scanner.nextInt();// radius값 읽기.
            circles[i] = new Circle(x, y, radius);// Circle 객체 생성
        }
        showLargestCircle();

        scanner.close();
    }

    private static void showLargestCircle() {
        Circle largestCircle = circles[0];

        for (int i = 1; i < 3; i++) {
            if (largestCircle.calculaterArea() < circles[i].calculaterArea()) {
                largestCircle = circles[i];
            }
        }

        System.out.printf("가장 면적이 큰 원은 (%3.1f, %3.1f) %d", largestCircle.getX(), largestCircle.getY(), largestCircle.getRadius());
    }
}
