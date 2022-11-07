package firstweek.mission2.BonusProblems.Bonus2;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return width * height;
    }

    public void show() {
        System.out.printf("(%d,%d)에서 크기가 %dX%d인 사각형\n", x, y, width, height);
    }

    public boolean contains(Rectangle r) {
        int rX = r.x;
        int rY = r.y;

        if (rX < x || rY < y || x + width - rX <= r.width || y + height - rY <= r.height) {
            return false;
        }
        return true;
    }
}
