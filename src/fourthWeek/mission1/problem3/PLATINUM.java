package fourthWeek.mission1.problem3;

public class PLATINUM extends Member {
    @Override
    public int applyDiscountRate(int shoppingAmount) {
        return shoppingAmount - (int) (shoppingAmount * 0.05);
    }

    @Override
    public int applyPointEarningRage(int shoppingAmount) {
        return (int) (shoppingAmount * 0.05);
    }

    @Override
    public int calculateParkingFee(int stayingHour) {
        return stayingHour * 1000;
    }
}
