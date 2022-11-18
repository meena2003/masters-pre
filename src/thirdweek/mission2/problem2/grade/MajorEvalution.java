package thirdweek.mission2.problem2.grade;

public class MajorEvalution implements GradeEvaluation {
    @Override
    public String getGrade(int score) {
        String grade;
        if (isS(score)) {
            grade = "S";
        } else if (isA(score)) {
            grade = "A";
        } else if (isB(score)) {
            grade = "B";
        } else if (isC(score)) {
            grade = "C";
        } else if (isD(score)) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }

    private boolean isS(int score) {
        return 95 <= score && score <= 100 ? true : false;
    }

    private boolean isA(int score) {
        return 90 <= score && score <= 94 ? true : false;
    }

    private boolean isB(int score) {
        return 80 <= score && score <= 89 ? true : false;
    }

    private boolean isC(int score) {
        return 70 <= score && score <= 79 ? true : false;
    }

    private boolean isD(int score) {
        return 60 <= score && score <= 69 ? true : false;
    }
}
