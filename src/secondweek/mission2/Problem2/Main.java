package secondweek.mission2.Problem2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IO io = new IO();
        String FILE_NAME = "C:/Users/kimdo/CodeSquad-PreCourse/src/secondweek/mission2/Problem2/input.txt";
        List<Student> studentList = io.readStudnetInfo(FILE_NAME);

        for (Student student : studentList) {
            student.printStudentInfo();
        }
    }
}

