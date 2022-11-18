package thirdweek.mission2.problem2.school;

import thirdweek.mission2.problem2.school.major.ComputerEngineeringMajor;
import thirdweek.mission2.problem2.school.major.KoreanAndLiteratureMajor;
import thirdweek.mission2.problem2.school.major.Major;

public class Student {
    private String studentName;
    private String studentId;
    private Major major;
    private Score score;

    public Student(String studentName, String studentId, String majorName, int... scores) {
        this.studentName = studentName;
        this.studentId = studentId;
        getMajorInstance(majorName);
        getScoreInstance(scores);
    }

    // 'Score' 인스턴스 생성한 후, Scores의 HashMap에 점수들을 저장
    private void getScoreInstance(int... scores) {
        score = new Score();
        score.setScores(scores);
    }

    // 전공 과목을 매개변수로 받아서 'Major' 인스턴스 생성
    private void getMajorInstance(String majorName) {
        if (majorName.equals("국어국문학과")) {
            major = new KoreanAndLiteratureMajor(majorName);
            return;
        }
        if (majorName.equals("컴퓨터공학과")) {
            major = new ComputerEngineeringMajor(majorName);
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public Score getScore() {
        return score;
    }

    public Major getMajor() {
        return major;
    }
}
