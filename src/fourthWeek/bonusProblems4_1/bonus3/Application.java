package fourthWeek.bonusProblems4_1.bonus3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String[] strArray = scan.nextLine().split(", ");

            studentList.add(new Student(strArray[0], strArray[1], strArray[2], strArray[3]));
        }

        System.out.println("----------------------------");

        for (int i = 0; i < 4; i++) {
            studentList.get(i).printAllInfo();
            System.out.println("----------------------------");
        }

        while (true) {
            System.out.println();
            System.out.print("학생 이름 >> ");
            String str = scan.nextLine();
            if (str.equals("그만")) {
                break;
            }
            for (int i = 0; i < studentList.size(); i++) {
                if (str.equals(studentList.get(i).getName())) {
                    studentList.get(i).printInfo();
                    System.out.println();
                }
            }
        }
    }
}
