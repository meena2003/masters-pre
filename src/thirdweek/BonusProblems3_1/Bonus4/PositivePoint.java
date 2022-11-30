package thirdweek.BonusProblems3_1.Bonus4;

import thirdweek.BonusProblems3_1.Bonus1.Point;

public class PositivePoint extends Point {

    public PositivePoint(int x, int y) {
        super(0, 0);
        if (x > 0 && y > 0) {
            move(x, y);
        }
    }

    public PositivePoint() {
        super(0, 0);
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ") 의 점";
    }

    @Override
    public void move(int x, int y) {
        if (x >= 0 && y >= 0) {
            super.move(x, y);
        }
    }
}
