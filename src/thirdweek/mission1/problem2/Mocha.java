package thirdweek.mission1.problem2;

public class Mocha extends AddOptionDecorator {
    public Mocha(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding Mocha Syrup");
    }
}
