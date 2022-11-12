package secondweek.mission2.problem3;

public class Dice {
    // 랜덤 숫자 만들기 메서드 (범위 설정)
    public static int makeRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }
}
