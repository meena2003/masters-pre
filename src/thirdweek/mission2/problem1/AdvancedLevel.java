package thirdweek.mission2.problem1;

public class AdvancedLevel extends PlayerLevel {

    @Override
    protected void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    protected void jump() {
        System.out.println("높이 jump 합니다.");
    }

    @Override
    protected void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    protected void showLevelMessage() {
        System.out.println("Advanced Level 입니다.");
    }
}
