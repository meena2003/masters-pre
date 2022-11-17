package thirdweek.mission2.problem2;

import java.util.HashMap;

public class Score {
    private GradeEvaluation gradeEvaluation;
    private HashMap<String, Integer> subjectScores;

    public Score() {
    }

    // 원하는 점수 체계의 인스턴스를 생성한 후, 학점으로 변환하여 반환
    public String getGrade(String subjectName, String compulsorySubject) {
        int score = getScore(subjectName);
        if (compulsorySubject.equals(subjectName)) {
            gradeEvaluation = new MajorEvalution();
        } else {
            gradeEvaluation = new BasicEvaluation();
        }
        return gradeEvaluation.getGrade(score);
    }

    // 매개변수로 받은 점수들을 SubjectName의 상수값과 매칭하여 HashMap에 저장.
    public void setScores(int[] scores) {
        subjectScores = new HashMap<>();
        for (int i = 0; i < scores.length; i++) {
            subjectScores.put(String.valueOf(SubjectName.values()[i]), scores[i]);
        }
    }

    public int getScore(String subjectName) {
        return subjectScores.get(subjectName);
    }

}
