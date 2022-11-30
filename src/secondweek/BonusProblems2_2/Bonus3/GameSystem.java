package secondweek.BonusProblems2_2.Bonus3;

import java.util.Scanner;

public class GameSystem {
    Scanner scan = new Scanner(System.in);
    private final int EASY_CHANCE;
    private final int NORMAL_CHANCE;
    private final int HARD_CHANCE;
    private final String LINE = "===============================";
    private final String LINE2 = "**                           **";
    private Computer computer;
    private int maxNum;
    private int minNum;
    private int chance;
    private boolean isContinue;

    public GameSystem() {
        EASY_CHANCE = 8;
        NORMAL_CHANCE = 7;
        HARD_CHANCE = 6;
        isContinue = true;
        computer = new Computer();
        maxNum = 99;
        minNum = 1;
    }

    private void chooseLevel(int level) {
        switch (level) {
            case 1:
                chance = EASY_CHANCE;
                break;
            case 2:
                chance = NORMAL_CHANCE;
                break;
            case 3:
                chance = HARD_CHANCE;
                break;
        }
    }

    public void playGame() {
        printHeader();
        printGuide();
        while (isContinue) {
            chooseLevel(selectLevel());
            printProgress();
            computer = new Computer();
            guessNumber(computer.getRANDOM_NUM());
            isContinue = isContinue();
            maxNum = 99;
            minNum = 1;
        }

        System.out.println("게임을 즐겨주셔서 감사합니다!");
    }

    private void printHeader() {
        try {
            Thread.sleep(1000);
            System.out.println(LINE);
            System.out.println(LINE2);
            System.out.println("**   컴퓨터의 숫자를 맞춰라!!!   **");
            System.out.println("**          (v.1.1)          **");
            System.out.println(LINE2);
            System.out.println(LINE);
            System.out.println();
        } catch (InterruptedException e) {}
    }

    private void printGuide() {
        try {
            Thread.sleep(1500);
            System.out.println("안녕하세요!");
            Thread.sleep(1500);
            System.out.println("반갑습니다.");
            Thread.sleep(1500);
            System.out.println("지금부터 게임을 실시하겠습니다.");
            Thread.sleep(1500);
            System.out.println("게임 규칙은 간단합니다.");
            Thread.sleep(1500);
            System.out.println(LINE);
            Thread.sleep(1500);
            System.out.println("(1) 컴퓨터가 1부터 99까지 무작위 숫자를 고릅니다.");
            Thread.sleep(1500);
            System.out.println("(2) 한정된 기회만큼 컴퓨터의 숫자를 맞추면 됩니다.");
            Thread.sleep(1500);
            System.out.println();
        } catch (InterruptedException e) {}
    }

    private int selectLevel() {
        try {
            System.out.println("그럼 난이도를 고르겠습니다.");
            Thread.sleep(1000);
            System.out.println("__________________________");
            System.out.printf(" [쉬움]  (1번) -- 기회 %d번\n", EASY_CHANCE);
            Thread.sleep(1000);
            System.out.printf(" [보통]  (2번) -- 기회 %d번\n", NORMAL_CHANCE);
            Thread.sleep(1000);
            System.out.printf(" [어려움] (3번) -- 기회 %d번\n", HARD_CHANCE);
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        while (true) {
            System.out.print("입력 >> ");
            int level = Integer.parseInt(scan.nextLine());
            if (level > 0 && level / 5 == 0) {
                return level;
            }
            System.out.println("잘못된 난이도 선택입니다. (1 ~ 3)에서 고르세요.");
        }
    }

    private void printProgress() {
        StringBuilder sb = new StringBuilder();
        try {
            Thread.sleep(1000);
            System.out.println();
            System.out.println(LINE);
            System.out.println();
            Thread.sleep(1500);
            System.out.println("-- 컴퓨터가 랜덤한 숫자를 추출합니다 -- ");
            for (int i = 0; i < 4; i++) {
                Thread.sleep(1000);
                sb.append(" . ");
                System.out.print(sb);
            }
            System.out.println();
            System.out.println();
            System.out.println("컴퓨터가 숫자를 추출하였습니다.");
            System.out.println();
            Thread.sleep(1500);
            System.out.println("본격적으로 게임을 시작합니다.");
            System.out.println();
        } catch (InterruptedException e) {}
    }

    private void guessNumber(int computerNum) {
        int answer = computerNum;
        outer:
        while (true) {
            switch (playRound(answer)) {
                case 100 :
                    System.out.println("올바른 값이 아닙니다.");
                    continue;
                case 1 :
                    System.out.println("Down! 더 낮은 숫자입니다.\n");
                    continue;
                case -1 :
                    System.out.println("Up! 더 높은 숫자입니다.\n");
                    continue;
                case -99 :
                    break outer;
                case 0 :
                    System.out.println("축하합니다!! 정답입니다 ^^");
                    System.out.println();
                    break outer;
            }
        }
    }

    private boolean isContinue() {
        try {
            Thread.sleep(1500);
            System.out.println("다시 하겠습니까? 예(1), 아니요(2) >> ");
        } catch (InterruptedException e) {}
        int isContinue = Integer.parseInt(scan.nextLine());
        return isContinue == 1 ? true : false;
    }

    private int playRound(int answer) {
        if (chance == 0) {
            try {
                Thread.sleep(1500);
                System.out.println("모든 기회를 소진하였습니다...");
                Thread.sleep(1000);
                System.out.print("G");
                Thread.sleep(1000);
                System.out.print("A");
                Thread.sleep(1000);
                System.out.print("M");
                Thread.sleep(1000);
                System.out.print("E");
                Thread.sleep(1000);
                System.out.print(" ");
                Thread.sleep(1000);
                System.out.print("O");
                Thread.sleep(1000);
                System.out.print("V");
                Thread.sleep(1000);
                System.out.print("E");
                Thread.sleep(1000);
                System.out.print("R");
                Thread.sleep(1800);
                System.out.println();
                System.out.println();
            } catch (InterruptedException e) {}
            return -99;
        }
        System.out.printf("[남은 기회: %d번] | ( %d ~ %d ) 중 숫자를 고르세요. >> ", chance, minNum, maxNum);
        int playerNum = Integer.parseInt(scan.nextLine());

        if (playerNum <= 0 || playerNum >= 100) {
            return 100;
        }
        chance--;
        if (playerNum > answer) {
            maxNum = playerNum - 1;
            return 1;
        }
        if (playerNum < answer) {
            minNum = playerNum + 1;
            return -1;
        }

        return 0;
    }
}
