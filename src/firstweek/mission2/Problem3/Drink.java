package firstweek.mission2.Problem3;

public class Drink {
    private String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return "[" +  name + ":" + price + "원]";
    }
}
