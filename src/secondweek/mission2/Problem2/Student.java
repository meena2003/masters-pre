package secondweek.mission2.Problem2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private static int makeNumber = 1000;
    private int studentNumber;
    private String major;
    private List<Subject> testScoreList;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void printStudentInfo() {
        System.out.printf("%s 학생은 %d과목을 수강했습니다.\n총점은 %d점이고 평균은 %3.1f점입니다.\n\n", name, getClassCount(), getSum(), getAvg());
    }

    private double getAvg() {
        double avg = (double) getSum() / (double) getClassCount();
        return Math.round(avg * 100) / 100;
    }

    private int getSum() {
        int sum = 0;
        for (Subject score : testScoreList) {
            sum += score.getTestScore();
        }
        return sum;
    }

    private int getClassCount() {
        return testScoreList.size();
    }

    public Student(String name, String major, List<Subject> subjectList) {
        this.name = name;
        studentNumber = makeNumber++;
        this.major = major;
        testScoreList = subjectList;
    }
}
