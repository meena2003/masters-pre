package firstweek.BonusProblems1_2.Bonus5;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    private static HashMap<String, String> phoneMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int numberCount;

        System.out.print("인원수 >> ");
        numberCount = scan.nextInt();

        for (int i = 0; i < numberCount; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력) >> ");
            String name = scan.next();
            String phoneNumber = scan.next();
            phoneMap.put(name, phoneNumber);
        }

        System.out.println("저장되었습니다...");

        while (true) {
            System.out.print("검색할 이름 >> ");
            String searchingName = scan.next();
            searchPhoneNumber(searchingName);
        }
    }

    private static void searchPhoneNumber(String searchingName) {
        if (searchingName.equals("그만")) {
            System.exit(0);
        } else if (phoneMap.containsKey(searchingName)) {
            String searchedPhoneNumber = phoneMap.get(searchingName);
            System.out.println(searchingName + "의 번호는 " + searchedPhoneNumber + "입니다.");
        } else {
            System.out.println(searchingName + "이 없습니다.");
        }
    }
}
