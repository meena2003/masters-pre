package thirdweek.mission1.problem2;

public class WhippedCream extends AddOptionDecorator {
    public WhippedCream(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding WhippedCream");
    }
}
