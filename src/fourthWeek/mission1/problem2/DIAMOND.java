package fourthWeek.mission1.problem2;

public class DIAMOND extends Member {
    @Override
    public int applyDiscountRate(int shoppingAmount) {
        return shoppingAmount - (int) (shoppingAmount * 0.10);
    }

    @Override
    public int applyPointEarningRage(int shoppingAmount) {
        return (int) (shoppingAmount * 0.10);
    }

    @Override
    public int calculateParkingFee(int stayingHour) {
        return 0;
    }

    @Override
    public void assignCounselor(String customerName) {
        System.out.println(customerName + "님, DIAMOND VIP고객을 위한 전문 상담원을 배정해 드리겠습니다.");
    }
}
