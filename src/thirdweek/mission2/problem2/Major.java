package thirdweek.mission2.problem2;

public abstract class Major {
    protected String majorName;
    protected String compulsorySubject;

    protected Major(String majorName) {
        this.majorName = majorName;
    }

    // 전공에 따라 '필수 과목'을 결정해주는 메서드
    abstract void getCompulsorySubject(String majorName);

    public String getCompulsorySubject() {
        return compulsorySubject;
    }
}
