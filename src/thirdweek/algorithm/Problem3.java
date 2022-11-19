package thirdweek.algorithm;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> scoreBoard = new ArrayList<>(Arrays.asList(0, 0));
        final int A_INDEX = 0;
        final int B_INDEX = 1;

        for (int index = 0; index < a.size(); index++) {
            int score;

            if (a.get(index) > b.get(index)) {
                score = scoreBoard.get(A_INDEX);
                scoreBoard.set(A_INDEX, ++score);
                continue;
            }
            if (a.get(index) < b.get(index)) {
                score = scoreBoard.get(B_INDEX);
                scoreBoard.set(B_INDEX, ++score);
                continue;
            }
            continue;
        }
        return scoreBoard;
    }
}

public class Problem3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result3.compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );
        bufferedReader.close();
        bufferedWriter.close();
    }
}

