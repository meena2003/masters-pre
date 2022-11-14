package thirdweek.mission1.problem1;

public class RED extends Member {
    public RED() {
        super(0, 1, 3000);
    }
    @Override
    int applyDiscountRate(int shoppingAmount) {
        int discount = shoppingAmount * discountRate;
        return shoppingAmount - discount;
    }

    @Override
    int applyPointEarningRage(int shoppingAmount) {
        return 0;
    }

    @Override
    int calculateParkingFee(int stayingHour) {
        return 0;
    }
}
