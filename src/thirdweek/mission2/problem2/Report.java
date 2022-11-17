package thirdweek.mission2.problem2;

import java.util.List;

public class Report {
    public void printScoresOfAllStudent(String subjectName, List<Student> studentList) {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------------\n")
                .append(String.format("          [ %s 수강생 학점 ]          \n", subjectName))
                .append(" 이름    |  학번  |  중점과목  |  점수    \n")
                .append("---------------------------------------\n");
                printScoreOfStudent(sb, subjectName, studentList);
        System.out.println(sb);
    }

    private StringBuilder printScoreOfStudent(StringBuilder sb, String subjectName, List<Student> studenctList) {

        for (int i = 0; i < studenctList.size(); i++) {
            Student student = studenctList.get(i);
            String compulsorySubject = student.getMajor().getCompulsorySubject();
            sb.append(String.format("%-6s", student.getStudentName()))
                    .append("|")
                    .append(String.format(" %-7s", student.getStudentId()))
                    .append("|")
                    .append(String.format("   %-6s", student.getMajor().getCompulsorySubject()))
                    .append("|")
                    .append(String.format(" %-3d:%2s ", student.getScore().getScore(subjectName), student.getScore().getGrade(subjectName, compulsorySubject)))
                    .append("|\n")
                    .append("---------------------------------------\n");
        }
        return sb;
    }
}
