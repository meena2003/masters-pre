package thirdweek.mission2.problem1;

public class Player {
    private String id;
    private PlayerLevel playerLevel;

    public Player(String id, PlayerLevel playerLevel) {
        this.id = id;
        this.playerLevel = playerLevel;
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
