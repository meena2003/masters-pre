package fourthWeek.mission1.problem1;

public class Customer {
    private static int designatedIdNumber = 1001;
    private final int CUSTOMER_ID;
    private String customerName;
    private Member membership;
    private int totalShoppingAmount;
    private int pointScore;
    private int totalParkingFee;

    public Customer(String customerName, Member membership) {
        this.CUSTOMER_ID = designatedIdNumber++;
        this.customerName = customerName;
        this.membership = membership;
    }

    public void inputShoppingAmount(int shoppingAmount) {
        totalShoppingAmount = calculateTotalShoppingAmount(shoppingAmount);
        pointScore = calculatePoint(shoppingAmount);
    }

    public void inputStayingTime(int stayingTime) {
        totalParkingFee = calculateTotalParkingFee(stayingTime);
    }

    private int calculateTotalShoppingAmount(int shoppingAmount) {
        return membership.applyDiscountRate(shoppingAmount);
    }

    private int calculatePoint(int shoppingAmount) {
        return membership.applyPointEarningRage(shoppingAmount);
    }

    private int calculateTotalParkingFee(int stayingTime) {
        return membership.calculateParkingFee(stayingTime);
    }

    public String showCustomerDetailInfo() {
        return String.format("%s님의 지불 금액은 %d원이고, 적립 포인트는 %d점 입니다.\n" +
                "주차 요금은 %d원 입니다.\n", customerName, totalShoppingAmount, pointScore, totalParkingFee);
    }

    public String showCustomerAbbreviateInfo() {
        return String.format("%s님의 아이디는 %d이고 등급은 %s입니다.\n", customerName, CUSTOMER_ID, membership.getMembershipName());
    }

    public void callCounselor() {
        membership.assignCounselor(customerName);
    }

    public int getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }
}
