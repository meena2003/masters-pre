package thirdweek.mission1.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        RED red = new RED();
        PLATINUM platinum = new PLATINUM();
        DIAMOND diamond = new DIAMOND();

        Customer james = new Customer("James", red, 10000, 2);
        Customer tomas = new Customer("Tomas", red, 30000, 2);
        Customer edward = new Customer("Edward", platinum, 10000, 2);
        Customer percy = new Customer("Percy", platinum, 30000, 2);
        Customer elizabet = new Customer("Elizabet", diamond, 30000, 2);

        List<Customer> customerList = new ArrayList<>(Arrays.asList(james, tomas, edward, percy, elizabet));
        printAllCustomersInfo(customerList);  // 모든 고객 정보 열람

        james.callCounselor(); // 일반 상담원 호출
        elizabet.callCounselor(); // VIP 전문 상담원 호출
    }

    public static void printAllCustomersInfo(List<Customer> customerList) {
        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }
    }
}
