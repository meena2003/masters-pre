package fourthWeek.mission1.problem1;

public class Customer {
    private String customerName;
    private Member membership;
    private int totalShoppingAmount;
    private int pointScore;
    private int totalParkingFee;

    public Customer(String customerName, Member membership, int shoppingAmount, int stayingTime) {
        this.customerName = customerName;
        this.membership = membership;
        totalShoppingAmount = calculateTotalShoppingAmount(shoppingAmount);
        pointScore = calculatePoint(shoppingAmount);
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

    public String showCustomerInfo() {
        return String.format("%s님의 지불 금액은 %d원이고, 적립 포인트는 %d점 입니다.\n" +
                "주차 요금은 %d원 입니다.\n", customerName, totalShoppingAmount, pointScore, totalParkingFee);
    }

    public void callCounselor() {
        membership.assignCounselor(customerName);
    }
}
