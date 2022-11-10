package secondweek.mission2.Problem2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IO {
    private static int idx = 0;
    private List<Student> studentList = new ArrayList<>();
    public List<Student> readStudnetInfo(String FILE_NAME) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));) {
            String line;
            while ((line = br.readLine()) != null) {
                if (idx == 0) {
                    idx++;
                    continue;
                }
                String[] studentInfo = line.split(",");
                studentList.add(createStudentInstance(studentInfo));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return studentList;
    }

    // 파일을 읽어서 학생생성
    private static Student createStudentInstance(String[] studentInfo) {
        int length = studentInfo.length;
        int idx = 0;
        String name = studentInfo[idx++];
        String major = studentInfo[idx++];
        List<Subject> subjectList = new ArrayList<>();

        if (idx < length && studentInfo[idx++] != "") {
            Subject subject = new Subject("국어", Integer.parseInt(studentInfo[2]));
            subjectList.add(subject);
        }

        if (idx < length && studentInfo[idx++] != "") {
            Subject subject = new Subject("수학", Integer.parseInt(studentInfo[3]));
            subjectList.add(subject);
        }

        if (idx < length && studentInfo[idx] != "") {
            Subject subject = new Subject("영어", Integer.parseInt(studentInfo[4]));
            subjectList.add(subject);
        }

        // 오류에서 힌트를 다 줬다...ㅋㅋㅋㅋ
        return new Student(name, major, subjectList);
    }
}
