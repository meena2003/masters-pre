package secondweek.mission2.problem3;

import java.util.ArrayList;
import java.util.List;

import static secondweek.mission2.problem3.Dice.makeRandomNumber;

public class Originator {
    private int money;
    private List<String> fruitsList;
    private int tryingCount = 0;

    public Originator() {
        money = 1000;
        fruitsList = new ArrayList<>();
    }

    // 주사위 굴리기 메서드
    public void throwDice() {
        tryingCount++;
        int diceNumber = makeRandomNumber(6);
        checkStatus(diceNumber);
        showPlayerStutus(diceNumber);
        Memento.getMemento();
        SetMemento();
        RestoreMemento();
    }

    private void checkStatus(int diceNumber) {
        switch (diceNumber) {
            case 1: case 3:
                increaseMoney();
                break;
            case 2: case 4:
                decreaseMoney();
                break;
            case 6:
                getFruit();
                break;
        }
    }
    private void increaseMoney() {
        money += 100;
    }

    private void decreaseMoney() {
        money /= 2;
    }

    private void getFruit() {
        fruitsList.add(DiceGame.getFruitList());
    }

    public void showPlayerStutus(int diceNumber) {
        System.out.println(tryingCount + "번째 시도 -----------------");
        System.out.println("주사위 숫자 : " + diceNumber + "번");
        System.out.println("Money > " + money + "원" );
        System.out.println("Fruits > " + ListtoString());
        System.out.println("==========================");
    }

    private String ListtoString() {
        return String.valueOf(fruitsList);
    }

    public int getMoney() {
        return money;
    }

    private void SetMemento() {
        if (money > Memento.getMemento().getMoney()) {
            Memento.getMemento().setMemento(money, fruitsList);
            System.out.println("[ 메멘토에 객체를 저장했습니다 ]");
            System.out.println("==========================");
        }
    }

    private void RestoreMemento() {
        if (money < Memento.getMemento().getMoney() / 2) {
            Memento memento = Memento.getMemento().restoreMemento();
            this.money = memento.getMoney();
            this.fruitsList = memento.getFruitsList();
            System.out.println("< 메멘토 객체로 복원했습니다 >");
            System.out.println("==========================");
        }
    }
}
