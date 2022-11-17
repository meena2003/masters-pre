package thirdweek.mission2.problem1;

public class Player {
    private String id;
    private PlayerLevel playerLevel;

    public Player(String id) {
        this.id = id;
        this.playerLevel = new BeginnerLevel();
    }

    public PlayerLevel getPlayerLevel() {
        return playerLevel;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
    }

    public void play(int time) {
        playerLevel.go(time);
    }
}
