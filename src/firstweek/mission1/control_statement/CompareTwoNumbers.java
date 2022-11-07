package firstweek.mission1.control_statement;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b) {
        return a > b ? ">" : (a < b ? "<" : "==");
    }
}
