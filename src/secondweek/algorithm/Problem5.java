package secondweek.algorithm;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
    public static String solution(int a, int b) {
        int totalDays = calculateTotalDays(a, b);
        return getDayOfWeek(totalDays);
    }

    private static int calculateTotalDays(int a, int b) {
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalMonthDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalMonthDays += month[i];
        }
        return totalMonthDays + b;
    }

    private static String getDayOfWeek(int totalDays) {
        String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        return dayOfWeek[totalDays % 7];
    }
}
