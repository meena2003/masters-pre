package secondweek.mission2.problem1;

public class CarTest {
    public static void main(String[] args) {
        HyundaiFactory factory = HyundaiFactory.getFactory();
        Car myCar = factory.createCar();
        Car yourCar = factory.createCar();
        Car NinoCar = factory.createCar();
        Car CoreCar = factory.createCar();

        System.out.println("첫번째 차 번호는" +myCar.showCarNumber());
        System.out.println("두번째 차 번호는" +yourCar.showCarNumber());
        System.out.println("세번째 차 번호는" +NinoCar.showCarNumber());
        System.out.println("네번째 차 번호는" +CoreCar.showCarNumber());
    }
}