package secondweek.BonusProblems2_2.Bonus2;

import java.util.Scanner;

public class FindingSystem {
    Scanner scan = new Scanner(System.in);

    public void startProgram() {
        System.out.println("한영 단어 겁색 프로그램입니다.");
        while (true) {
            System.out.print("한글 단어? ");
            String wordKor = scan.nextLine();
            if (wordKor.equals("그만")) {
                break;
            }
            searchWord(wordKor);
        }
    }

    private void searchWord(String wordKor) {
        String wordEng = Dictionary.kor2Eng(wordKor);
        if (!wordEng.equals("")) {
            System.out.println(wordKor + "은(는) " + wordEng);
            return;
        }
        System.out.println(wordKor + "은(는) 저의 사전에 없습니다.");
    }
}
