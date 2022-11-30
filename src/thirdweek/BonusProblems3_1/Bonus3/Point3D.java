package thirdweek.BonusProblems3_1.Bonus3;

import thirdweek.BonusProblems3_1.Bonus1.Point;

public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void move(int x, int y) {
        super.move(x, y);
    }

    public void move(int x, int y, int z) {
        move(x, y);
        this.z = z;
    }

    public void moveUp() {
        z++;
    }

    public void moveDown() {
        z--;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ") 의 점";
    }
}
