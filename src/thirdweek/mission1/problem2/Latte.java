package thirdweek.mission1.problem2;

public class Latte extends AddOptionDecorator {
    public Latte(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding Milk");
    }
}
