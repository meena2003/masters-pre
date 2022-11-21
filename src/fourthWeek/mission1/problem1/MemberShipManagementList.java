package fourthWeek.mission1.problem1;

import java.util.ArrayList;
import java.util.List;

public class MemberShipManagementList {
    private final String LINE = "===================================\n";
    private List<Customer> memberShipManagement;

    public MemberShipManagementList() {
        this.memberShipManagement = new ArrayList<>();
    }

    public void addMemberShip(String customerName, GRADE membershipGrade) {
        memberShipManagement.add(new Customer(customerName, membershipGrade.getMember()));
    }

    public void showAllMember() {
        StringBuilder sb = new StringBuilder();
        sb.append(LINE);
        for (Customer customer : memberShipManagement) {
            sb.append(customer.showCustomerAbbreviateInfo());
        }
        System.out.println(sb);
    }

    public boolean removeMember(int custemerId) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < memberShipManagement.size(); i++) {
            if (memberShipManagement.get(i).getCUSTOMER_ID() == custemerId) {
                memberShipManagement.remove(i);
                return true;
            }
        }
        System.out.println(sb.append(LINE).append(custemerId + "에 해당하는 멤버가 없습니다.\n"));
        return false;
    }
}
