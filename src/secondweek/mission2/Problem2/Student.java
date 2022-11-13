//package secondweek.mission2.Problem2;
//
//import java.util.List;
//
//public class Student {
//    private int studentId;
//    private String studentName;
//    private static int makeNumber = 1000;
//    private List<Score> scoreList;
//    private Subject major;
//    private List<Subject> testScoreList;
//
//    public Student() {
//    }
//
//    public String getName() {
//        return studentName;
//    }
//
//    public void printStudentInfo() {
//        System.out.printf(getName()+" 학생은 "+ getClassCount() +"과목을 수강했습니다.\n");
//        System.out.printf("총점은 "+ getSum() +"점이고 평균은 "+ getAvg() +"점입니다.\n");
//    }
//
//    private double getAvg() {
//        double avg = (double) getSum() / (double) getClassCount();
//        return Math.round(avg * 100) / 100.0;
//    }
//
//    private int getSum() {
//        int sum = 0;
//        for (Subject score : testScoreList) {
//            sum += score.getTestScore();
//        }
//        return sum;
//    }
//
//    private int getClassCount() {
//        return testScoreList.size();
//    }
//
//    public Student(String studentName, Subject major, List<Subject> subjectList) {
//        this.studentName = studentName;
//        studentId = makeNumber++;
//        this.major = major;
//        testScoreList = subjectList;
//    }
//}
