package secondweek.BonusProblems2_2.Bonus3;

public class Computer {
    private final int RANDOM_NUM;

    public Computer() {
        RANDOM_NUM = makeRandomNum();
    }

    private int makeRandomNum() {
        return (int) (Math.random() * 99) + 1;
    }

    public int getRANDOM_NUM() {
        return RANDOM_NUM;
    }
}
