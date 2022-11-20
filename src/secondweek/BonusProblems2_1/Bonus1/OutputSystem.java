package secondweek.BonusProblems2_1.Bonus1;

import java.io.IOException;

public class OutputSystem {
    public void printGameGuide() {
        System.out.println("끝말잇기 게임을 시작합니다!!");
    }

    public void printFirstWord() {
        System.out.println("시작 단어는 " + WordsManagementSystem.FIRST_WORD + "입니다.");
    }

    public void printPlayerName(int index) {
        System.out.print(GamePlaySystem.getPlayers(index));
    }
}
