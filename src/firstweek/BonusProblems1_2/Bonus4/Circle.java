package firstweek.BonusProblems1_2.Bonus4;

class Circle {

    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;   //x, y, radius 초기화
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public void show() {
        System.out.printf("(%3.1f,%3.1f)%d", x, y, radius);
    }

    public double calculaterArea() {
        return 3.14 * Math.pow(radius, 2);
    }
}
