package thirdweek.algorithm;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    private static final int LOWER_LIMIT = 38;

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> answer = new ArrayList<>();

        for (Integer grade : grades) {
            if (grade < LOWER_LIMIT) {
                answer.add(grade);
                continue;
            }
            if (grade % 5 == 0) {
                answer.add(grade);
                continue;
            }
            if (grade % 5 != 3 && grade % 5 != 4) {
                answer.add(grade);
                continue;
            }
            int extraPoint = grade % 5 == 3 ? 2 : 1;
            answer.add(grade + extraPoint);
        }

        return answer;
    }
}

public class Problem2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

