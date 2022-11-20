package thirdweek.mission1.problem1;

public abstract class Member {
    abstract int applyDiscountRate(int shoppingAmount);

    abstract int applyPointEarningRage(int shoppingAmount);

    abstract int calculateParkingFee(int stayingHour);

    void assignCounselor(String customerName) {
        System.out.println(customerName + "님, 일반 상담원을 연결해드리겠습니다.");
    }
}
