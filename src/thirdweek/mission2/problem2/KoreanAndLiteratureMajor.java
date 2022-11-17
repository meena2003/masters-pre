package thirdweek.mission2.problem2;

public class KoreanAndLiteratureMajor extends Major {

    public KoreanAndLiteratureMajor(String majorName) {
        super(majorName);
        getCompulsorySubject(majorName);
    }

    // 전공명이 "국어국문학과"이면 필수 과목으로 '국어'를 변수에 저장
    @Override
    void getCompulsorySubject(String majorName) {
        if (majorName.equals("국어국문학과")) {
            compulsorySubject = "국어";
        }
    }
}
