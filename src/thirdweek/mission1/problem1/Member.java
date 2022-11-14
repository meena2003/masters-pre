package thirdweek.mission1.problem1;

abstract class Member {
    protected int discountRate;
    protected int pointEarningRate;
    protected int parkingFeePerHour;

    protected Member(int discountRate, int pointEarningRate, int parkingFeePerHour) {
        this.discountRate = discountRate;
        this.pointEarningRate = pointEarningRate;
        this.parkingFeePerHour = parkingFeePerHour;
    }

    abstract int applyDiscountRate(int shoppingAmount);
    abstract int applyPointEarningRage(int shoppingAmount);
    abstract int calculateParkingFee(int stayingHour);
}
