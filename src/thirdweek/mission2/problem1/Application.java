package thirdweek.mission2.problem1;

public class Application {
    public static void main(String[] args) {
        Player player1 = new Player("abc123", new BeginnerLevel());
        player1.play(1);
        player1.upgradeLevel(new AdvancedLevel());
        player1.play(2);
        player1.upgradeLevel(new SuperLevel());
        player1.play(3);

        BeginnerLevel beginnerLevel = new BeginnerLevel();
        beginnerLevel.run();  // Application에선 직접 접근하지 못하게 하고 싶으면 어떻게 하지?
    }
}
