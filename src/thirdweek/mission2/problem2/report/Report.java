package thirdweek.mission2.problem2.report;

import thirdweek.mission2.problem2.school.Student;

import java.util.List;

public class Report {
    private static final String HEADER = " 이름    |  학번  |  중점과목  |  점수    \n";
    private static final String LINE = "---------------------------------------\n";
    public void printScoresOfAllStudent(String subjectName, List<Student> studentList) {
        StringBuilder sb = new StringBuilder();
        sb.append(LINE)
                .append(String.format("          [ %s 수강생 학점 ]          \n", subjectName))
                .append(HEADER)
                .append(LINE);
                printScoreOfStudent(sb, subjectName, studentList);
        System.out.println(sb);
    }

    private StringBuilder printScoreOfStudent(StringBuilder sb, String subjectName, List<Student> studenctList) {

        for (int i = 0; i < studenctList.size(); i++) {
            Student student = studenctList.get(i);
            String compulsorySubject = student.getMajor().getCompulsorySubject();
            int score = student.getScore().getScore(subjectName);
            if (score == -1) {
                continue;
            }
            sb.append(String.format("%-6s", student.getStudentName()))
                    .append("|")
                    .append(String.format(" %-7s", student.getStudentId()))
                    .append("|")
                    .append(String.format("   %-6s", student.getMajor().getCompulsorySubject()))
                    .append("|")
                    .append(String.format(" %-3d:%2s ", score, student.getScore().getGrade(subjectName, compulsorySubject)))
                    .append("|\n")
                    .append(LINE);
        }
        return sb;
    }
}
