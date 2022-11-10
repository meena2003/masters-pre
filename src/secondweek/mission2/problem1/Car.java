package secondweek.mission2.problem1;

public class Car {
    private static int registerNumber = 1000;
    private int carNumber;

    public Car() {
        carNumber = registerNumber++;
    }

    public int showCarNumber() {
        return carNumber;
    }
}
