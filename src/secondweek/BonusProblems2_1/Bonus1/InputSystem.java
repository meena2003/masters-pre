package secondweek.BonusProblems2_1.Bonus1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputSystem {
    private BufferedReader br;

    public InputSystem() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int inputPlayerNumber() throws IOException {
        System.out.print("게임에 참여하는 인원은 몇명입니까>> ");
        return Integer.parseInt(br.readLine());
    }

    public String inputPlayerName() throws IOException {
        System.out.print("참가자 이름을 입력해주세요. >> ");
        return br.readLine();
    }

    public String inputNextWord() throws IOException {
        return br.readLine();
    }
}
