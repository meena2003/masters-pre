package fourthWeek.mission1.problem4;

public class RED extends Member {

    @Override
    public int applyDiscountRate(int shoppingAmount) {
        return shoppingAmount;
    }

    @Override
    public int applyPointEarningRage(int shoppingAmount) {
        return (int) (shoppingAmount * 0.01);
    }

    @Override
    public int calculateParkingFee(int stayingHour) {
        return stayingHour * 3000;
    }
}
