package thirdweek.mission2.problem1;

public class BeginnerLevel extends PlayerLevel {
    @Override
    protected void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    protected void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    protected void showLevelMessage() {
        System.out.println("***** 초급자 레벨 입니다 *****");
    }

    private void test() {
        System.out.println("테스트");
    }
}
