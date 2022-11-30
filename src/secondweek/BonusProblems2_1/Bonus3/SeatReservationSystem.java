package secondweek.BonusProblems2_1.Bonus3;

import java.util.Scanner;

public class SeatReservationSystem {
    private SeatType[] seatTypes;

    Scanner scan = new Scanner(System.in);

    public SeatReservationSystem() {
        seatTypes = new SeatType[]{new SType(), new AType(), new BType()};
    }

    public void startSystem() {
        boolean isContinue = true;
        System.out.println("Shine 콘서트홀 예약 시스템입니다.");
        System.out.println();

        while (isContinue) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            switch (selectMenu()) {
                case 1:
                    makeReservation(selectSeatType());
                    break;
                case 2:
                    showAllSeats();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    isContinue = false;
            }
        }
    }

    private int selectMenu() {
        while (true) {
            int menu = Integer.parseInt(scan.nextLine());
            if (menu > 0 && menu / 5 == 0) {
                return menu;
            }
            System.out.println("올바른 메뉴 번호가 아닙니다.");
        }
    }

    private int selectSeatType() {
        while (true) {
            System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
            int seatType = Integer.parseInt(scan.nextLine());
            if (seatType <= 0 || seatType / 4 != 0) {
                System.out.println("올바른 좌석 타입이 아닙니다.");
                continue;
            }
            return seatType;
        }
    }

    private void makeReservation(int seatType) {
        int index = seatType - 1;
        SeatType seatTpye = seatTypes[index];
        seatTpye.printSeats();
        seatTpye.saveSeat(inputName(), inputSeatNum());
        System.out.println();
    }

    private String inputName() {
        System.out.print("이름>> ");
        return scan.nextLine();
    }

    private int inputSeatNum() {
        System.out.print("번호>> ");
        int seatNum = Integer.parseInt(scan.nextLine());
        return seatNum;
    }

    private void showAllSeats() {
        for (SeatType seatType : seatTypes) {
            seatType.printSeats();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
        System.out.println();
    }

    private void cancelReservation() {
        String name = inputName();
        for (SeatType seatType : seatTypes) {
            if (seatType.deleteSeat(name)) {
                return;
            }
        }
        System.out.printf("예약 내역 중 %s는(은) 없습니다.\n", name);
        System.out.println();
    }
}
