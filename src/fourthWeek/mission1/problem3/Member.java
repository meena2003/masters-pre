package fourthWeek.mission1.problem3;

public abstract class Member {
    protected String membershipName;

    protected Member() {
        String className = getClass().getName();
        membershipName = className.substring(className.lastIndexOf(".") + 1);
    }
    abstract int applyDiscountRate(int shoppingAmount);

    abstract int applyPointEarningRage(int shoppingAmount);

    abstract int calculateParkingFee(int stayingHour);

    void assignCounselor(String customerName) {
        System.out.println(customerName + "님, 일반 상담원을 연결해드리겠습니다.");
    }

    public String getMembershipName() {
        return membershipName;
    }
}
