package firstweek.mission2.Problem3;

public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void buyDrink(Cafe cafe, String drinkName) {
        System.out.printf("%s는 %d원을 가지고 있었고, %s에서 %s를 마시면서 %d원을 지불했습니다.\n"
                , name, money, cafe.getName(), cafe.getDrink(drinkName).getName(), cafe.getDrink(drinkName).getPrice());
        money -= cafe.getDrink(drinkName).getPrice();
    }
}
