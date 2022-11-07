package firstweek.mission2.problem1;

public class Problem1 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        TwoNumbers twoNumbers = new TwoNumbers();

        double numberOne = twoNumbers.getNumberOne();
        double numberTwo = twoNumbers.getNumberTwo();

        // 어떻게 하면 소수점이 아닐때는 정수형으로 표현할까?
        System.out.printf("%3.1f + %3.1f = %3.1f\n", numberOne, numberTwo, calculator.add(numberOne, numberTwo));
        System.out.printf("%3.1f - %3.1f = %3.1f\n", numberOne, numberTwo, calculator.minus(numberOne, numberTwo));
        System.out.printf("%3.1f x %3.1f = %3.1f\n", numberOne, numberTwo, calculator.multiply(numberOne, numberTwo));
        System.out.printf("%3.1f / %3.1f = %3.1f\n", numberOne, numberTwo, calculator.subtract(numberOne, numberTwo));
    }
}
