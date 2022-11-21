package fourthWeek.mission1.problem3;

import java.util.*;

public class MemberShipManagementMap {
    private final String LINE = "===================================\n";
    private Map<Integer, Customer> memberShipManagement;

    public MemberShipManagementMap() {
        this.memberShipManagement = new HashMap<>();
    }

    public void addMemberShip(int customerId, String customerName, GRADE membershipGrade) {
        if (memberShipManagement.containsKey(customerId)) {
            System.out.printf("이미 있는 아이디 %s의 값이 변경됩니다.\n", customerId);
        }
        memberShipManagement.put(customerId, new Customer(customerId, customerName, membershipGrade.getMember()));
    }

    public void showAllMember() {
        StringBuilder sb = new StringBuilder();
        sb.append(LINE);
        for (Map.Entry<Integer, Customer> customer : memberShipManagement.entrySet()) {
            sb.append(customer.getValue().showCustomerAbbreviateInfo());
        }
        System.out.println(sb);
    }

    public boolean removeMember(int customerId) {
        StringBuilder sb = new StringBuilder();
        if (memberShipManagement.containsKey(customerId)) {
            memberShipManagement.remove(customerId);
            return true;
        }
        System.out.println(sb.append(LINE).append(customerId + "에 해당하는 멤버가 없습니다.\n"));
        return false;
    }
}
