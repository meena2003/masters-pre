package firstweek.BonusProblems1_2.Bonus3;

class Circle {

    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;   //x, y, radius 초기화
    }

    public void show() {
        System.out.printf("(%3.1f,%3.1f)%d", x, y, radius);
    }
}
