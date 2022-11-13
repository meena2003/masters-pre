package firstweek.BonusProblems1_1.Bonus5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("연산>> ");
        float a = Float.parseFloat(scan.next());
        String operator = scan.next();
        float b = Float.parseFloat(scan.next());
        if (b == 0) {
            System.out.println("0으로는 나눌 수 없습니다.");
            System.exit(0);
        }

        float result = 0f;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
        }

        System.out.printf("%3.1f %s %3.1f의 계산 결과는 %3.1f", a, operator, b, result);
    }
}
