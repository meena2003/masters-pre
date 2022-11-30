package secondweek.BonusProblems2_1.Bonus3;

abstract class SeatType {
    private final int MAX_LENGTH = 10;
    protected String[] seats;

    protected SeatType() {
        seats = new String[MAX_LENGTH];
    }

    protected abstract void printSeats();

    protected void showSeats() {
        StringBuilder sb = new StringBuilder();
        for (String seat : seats) {
            if (seat != null) {
                sb.append(String.format("%6s ", seat));
                continue;
            }
            sb.append(" ______ ");
        }
        System.out.println(sb);
    }

    protected void saveSeat(String name, int seatNum) {
        if (seatNum <= 0 || seatNum / 11 != 0 ) {
            System.out.println("올바른 좌석 번호가 아닙니다.");
            return;
        }
        if (seats[seatNum - 1] != null) {
            System.out.println("이미 예약된 자리입니다.");
            return;
        }
        seats[seatNum - 1] = name;
    }

    protected boolean deleteSeat(String name) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null && seats[i].equals(name)) {
                seats[i] = null;
                System.out.printf("%s님 예약을 삭제하였습니다.\n", name);
                System.out.println();
                return true;
            }
        }
        return false;
    }
}
