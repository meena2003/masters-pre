package fourthWeek.bonusProblems4_1.bonus1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Point {
    private List<Grade> grades;

    public enum Grade {
        A(4.0f), B(3.0f), C(2.0f), D(1.0f), F(0.0f);
        private float score;

        Grade(float score) {
            this.score = score;
        }

        private float getScore() {
            return score;
        }
    }

    public Point() {
        grades = new ArrayList<>();
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public float getAverage() {
        float sum = 0f;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i).getScore();
        }

        return sum / grades.size();
    }
}
