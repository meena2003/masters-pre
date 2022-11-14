package thirdweek.mission1.problem2;

public abstract class AddOptionDecorator implements Coffee {
    private Coffee decoratedCoffee;
    public AddOptionDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public void brewing() {
        decoratedCoffee.brewing();
    }
}
