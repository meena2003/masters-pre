package thirdweek.mission1.problem1;

abstract class Member {
    abstract int applyDiscountRate(int shoppingAmount);
    abstract int applyPointEarningRage(int shoppingAmount);
    abstract int calculateParkingFee(int stayingHour);

    public void assignCounselor(String customerName) {
        System.out.println(customerName + "님, 일반 상담원을 연결해드리겠습니다.");
    }
}
