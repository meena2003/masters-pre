package secondweek.BonusProblems2_1.Bonus2;

public class Day {
    private String work;

    public void saveTodayWork(String work) {
        this.work = work;
        System.out.println();
    }

    public String getTodayWork() {
        return work;
    }

    public String hasWork() {
        if (work == null) {
            return "없습니다.";
        } else {
            return work + "입니다.";
        }
    }
}
