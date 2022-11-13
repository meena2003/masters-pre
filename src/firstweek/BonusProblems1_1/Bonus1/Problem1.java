package firstweek.BonusProblems1_1.Bonus1;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.next());
        int b = Integer.parseInt(scan.next());
        int c = Integer.parseInt(scan.next());
        printMiddleNumber(getMiddleNumber(a, b, c));
    }

    private static int getMiddleNumber(int a, int b, int c) {
        int middleNumber;
        if (a < b && a > c) {
            middleNumber = a;
        } else if (b < a && b > c) {
            middleNumber = b;
        }
        middleNumber = c;
        return middleNumber;
    }

    private static void printMiddleNumber(int middleNumber) {
        System.out.println("중간 값은 " + middleNumber);
    }

}
