package thirdweek.BonusProblems3_1.Bonus2;

import thirdweek.BonusProblems3_1.Bonus1.ColorPoint;

public class Application {
    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}
