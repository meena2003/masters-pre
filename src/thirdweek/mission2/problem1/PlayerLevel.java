package thirdweek.mission2.problem1;

abstract class PlayerLevel {
    protected abstract void run();
    protected abstract void jump();
    protected abstract void turn();
    protected abstract void showLevelMessage();
    protected void go(int time) {
        run();
        for (int i = 0; i < time; i++) {
            jump();
        }
        turn();
        System.out.println();
    }
}
