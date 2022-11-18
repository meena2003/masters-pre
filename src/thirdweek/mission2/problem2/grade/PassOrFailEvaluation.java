package thirdweek.mission2.problem2.grade;

public class PassOrFailEvaluation implements GradeEvaluation {
    @Override
    public String getGrade(int score) {
        String grade;
        if (isPass(score)) {
            grade = "P";
        } else {
            grade = "F";
        }
        return grade;
    }

    private boolean isPass(int score) {
        return 70 <= score ? true : false;
    }
}
