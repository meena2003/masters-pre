package thirdweek.mission2.problem2;

import thirdweek.mission2.problem2.report.Report;
import thirdweek.mission2.problem2.school.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Report report = new Report();
        Student student1 = new Student("강감찬", "211213", "국어국문학과", 95, 56, 95);
        Student student2 = new Student("김유신", "212330", "컴퓨터공학과", 95, 98, 85);
        Student student3 = new Student("신사임당", "201518", "국어국문학과", 100, 88, 55);
        Student student4 = new Student("이순신", "202360", "국어국문학과", 89, 95);
        Student student5 = new Student("홍길동", "201290", "컴퓨터공학과", 83, 56);

        List<Student> studentList = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5));
        report.printScoresOfAllStudent("방송댄스", studentList);
        report.printScoresOfAllStudent("국어", studentList);
    }
}
