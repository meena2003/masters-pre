package firstweek.mission2.Problem3;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private String name;
    private ArrayList<Drink> menu;

    public Cafe(String name) {
        this.name = name;
        menu = new ArrayList<>();
    }

    public Cafe(String name, Drink ... drinks) {
        this(name);
        convertArrayToList(drinks);  // 배열을 ArrayList로 변환
    }

    private List<Drink> convertArrayToList(Drink[] registeredDrinkList) {
        for (int i = 0; i < registeredDrinkList.length; i++) {
            menu.add(registeredDrinkList[i]);
        }
        return menu;
    }

    public String getName() {
        return name;
    }

    public Drink getDrink(String drinkName) {
        Drink SelectedDrink;
        for (int i = 0; i < menu.size(); i++) {
            if (drinkName.equals(menu.get(i).getName())) {
                SelectedDrink = menu.get(i);
                return SelectedDrink;
            }
        }
        return new Drink("없음", 0);
    }

    public void getMenu() {
        System.out.println(menu);
    }

    public void addMenu(Drink drink) {
        menu.add(drink);
    }

    public void removeMenu(Drink drink) {
        menu.remove(drink);
    }
}
