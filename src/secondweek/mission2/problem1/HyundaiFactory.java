package secondweek.mission2.problem1;

// 싱글톤 패턴
public class HyundaiFactory {
    private static HyundaiFactory hyundaiFactory;

    private HyundaiFactory() {
    }

    public static HyundaiFactory getFactory() {
        if (hyundaiFactory == null) {
            hyundaiFactory = new HyundaiFactory();
        }
        return hyundaiFactory;
    }

    public Car createCar(){
        return new Car();
    }
}
