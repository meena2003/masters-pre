package firstweek.mission2.Problem4;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private boolean isLeapYear;
    private int[][] arrayOfLastDays = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
            , {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        isLeapYear = isLeapYear(year);
    }

    private boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public String isValid() {
        int idx = isLeapYear ? 0 : 1;
        int lastDay = arrayOfLastDays[idx][month - 1];

        return String.format("%d년 %d월 %d일은 %s 날짜입니다.", year, month, day, checkDay(day, lastDay));
    }

    public String checkDay(int day, int lastDay) {
        if (day > lastDay) {
            return "유효하지 않은";
        } else {
            return "유효한";
        }
    }
}
