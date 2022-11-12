package secondweek.mission2.problem3;

public class DiceGame {
    private static final String[] FRUITSARRAY = {"사과", "샤인머스킷", "귤"};
    private static int fruitIndex = 0;

    public void playGame(Originator player) {
        int count = 1;
        while(isContinue(count++, player.getMoney())) {
            player.throwDice();
        }
    }

    private boolean isContinue(int count, int money) {
        return count <= 100 && 0 < money ? true : false;
    }

    public static String getFruitList() {
        if (2 < fruitIndex) {
            fruitIndex = 0;
        }
        return FRUITSARRAY[fruitIndex++];
    }
}
