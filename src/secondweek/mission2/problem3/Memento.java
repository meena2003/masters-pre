package secondweek.mission2.problem3;

import java.util.List;

public class Memento {
    private static Memento memento;
    private static int money;
    private static List<String> fruitsList;

    private Memento() {
    }

    public static Memento getMemento() {
        if (memento == null) {
            memento = new Memento();
        }
        return memento;
    }

    public void setMemento(int money, List<String> fruitsList) {
        this.money = money;
        this.fruitsList = fruitsList;
    }

    public Memento restoreMemento() {
        return memento;
    }

    public int getMoney() {
        return money;
    }

    public List<String> getFruitsList() {
        return fruitsList;
    }
}
