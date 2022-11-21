package fourthWeek.mission1.problem3;

public enum GRADE {
    RED(new RED()), PLATINUM(new PLATINUM()), DIAMOND(new DIAMOND());
    private Member member;

    GRADE(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return member;
    }
}
