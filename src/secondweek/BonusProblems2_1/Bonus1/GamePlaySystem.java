package secondweek.BonusProblems2_1.Bonus1;

import java.io.IOException;
import java.util.HashMap;

public class GamePlaySystem {
    private static OutputSystem outputSystem;
    private static InputSystem inputSystem;
    private static WordsManagementSystem wordsManagementSystem;
    private static String[] players;

    public GamePlaySystem() {
        outputSystem = new OutputSystem();
        inputSystem = new InputSystem();
        wordsManagementSystem = new WordsManagementSystem();
    }

    public void playGame() throws IOException {
        outputSystem.printGameGuide();
        int playerNumber = inputSystem.inputPlayerNumber();
        makeStringArray(playerNumber);
        repeatInputPlayerInfo(playerNumber);
        outputSystem.printFirstWord();
        repeatGame(playerNumber);
    }

    private void makeStringArray(int number) {
        players = new String[number];
    }

    private void enrollPlayer(String playerName, int index) {
        players[index] = playerName;
    }

    private void repeatInputPlayerInfo(int count) throws IOException {
        for (int index = 0; index < count; index++) {
            enrollPlayer(inputSystem.inputPlayerName(), index);
        }
    }

    private void repeatGame(int playerNumber) throws IOException {
        int index = 0;
        boolean flag = true;
        while (flag) {
            outputSystem.printPlayerName(index++ % playerNumber);
            System.out.print(" >> ");
            String nextWord = inputSystem.inputNextWord();
            flag = wordsManagementSystem.compareWord(nextWord) && wordsManagementSystem.isDuplicatedWord(nextWord)
                    && wordsManagementSystem.isOneCharacter(nextWord);
        }
        outputSystem.printPlayerName((index - 1) % playerNumber);
        System.out.println("이(가) 졌습니다.");
    }

    public static String getPlayers(int index) {
        return players[index];
    }

    public static OutputSystem getOutputSystem() {
        return outputSystem;
    }

    public static InputSystem getInputSystem() {
        return inputSystem;
    }

    public static WordsManagementSystem getWordsManagementSystem() {
        return wordsManagementSystem;
    }
}
