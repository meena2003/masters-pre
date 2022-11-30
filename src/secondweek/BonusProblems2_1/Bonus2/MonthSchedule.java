package secondweek.BonusProblems2_1.Bonus2;

import java.util.Arrays;
import java.util.Scanner;

public class MonthSchedule {
    private final Day[] days;

    Scanner scan = new Scanner(System.in);
    public MonthSchedule(int lastDay) {
        days = new Day[lastDay];
    }

    public void startProgram() {
        boolean isContinue = true;
        System.out.println("이번달 스케줄 관리 프로그램.");
        while (isContinue) {
            switch (selectMenu()) {
                case 1:
                    recordDayWork();
                    break;
                case 2:
                    getDayWork();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    isContinue = false;
            }
        }
    }

    private int selectMenu() {
        System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
        return Integer.parseInt(scan.nextLine());
    }

    private int selectDay() {
        System.out.printf("날짜(1 ~ %d) ? ", days.length);
        return Integer.parseInt(scan.nextLine());
    }

    private int saveDay(int day) {
        int index = day - 1;
        days[index] = new Day();
        return index;
    }

    private void recordDayWork() {
        int index = saveDay(selectDay());
        System.out.print("할일(빈칸없이 입력) ? ");
        days[index].saveTodayWork(scan.nextLine());
    }

    private void getDayWork() {
        int day = selectDay();
        try {
            String dayWork = days[day - 1].hasWork();
            System.out.printf("%d일의 할 일은 %s\n\n", day, dayWork);
        } catch (NullPointerException e) {
            System.out.println("해당일에 할일이 없습니다.");
        }
    }
}
