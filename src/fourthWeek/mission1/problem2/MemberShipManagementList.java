package fourthWeek.mission1.problem2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberShipManagementList {
    private final String LINE = "===================================\n";
    private Set<Customer> memberShipManagement;

    public MemberShipManagementList() {
        this.memberShipManagement = new HashSet<>();
    }

    public void addMemberShip(String customerName, GRADE membershipGrade) {
        memberShipManagement.add(new Customer(customerName, membershipGrade.getMember()));
    }

    public void addMemberShip(int customerId, String customerName, GRADE membershipGrade) {
        if (!memberShipManagement.add(new Customer(customerId, customerName, membershipGrade.getMember()))) {
            System.out.println("이미 있는 아이디 " + customerId + "는 추가할 수 없습니다.");
        }
    }

    public void showAllMember() {
        StringBuilder sb = new StringBuilder();
        sb.append(LINE);
        for (Customer customer : memberShipManagement) {
            sb.append(customer.showCustomerAbbreviateInfo());
        }
        System.out.println(sb);
    }

    public boolean removeMember(int customerId) {
        StringBuilder sb = new StringBuilder();
        Iterator it = memberShipManagement.iterator();
        while (it.hasNext()) {
            Customer customer = (Customer) it.next();
            if (customerId == customer.getCUSTOMER_ID()) {
                memberShipManagement.remove(customer);
                return true;
            }
        }
        System.out.println(sb.append(LINE).append(customerId + "에 해당하는 멤버가 없습니다.\n"));
        return false;
    }
}
