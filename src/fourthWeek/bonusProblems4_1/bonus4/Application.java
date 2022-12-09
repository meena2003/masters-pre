package fourthWeek.bonusProblems4_1.bonus4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scan = new Scanner(System.in);

        System.out.println("Shine 장학금 관리 시스템입니다.\n");

        for (int i = 0; i < 5; i++) {
            System.out.print("이름과 학점 >> ");
            String[] str = scan.nextLine().split(" ");
            studentList.addStudent(str[0], Double.parseDouble(str[1]));
            System.out.println();
        }

        System.out.print("장학생 선발 학점 기준 입력 >> ");
        studentList.printList(scan.nextDouble());
    }
}
