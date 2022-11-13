package secondweek.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }

    private static final int[] A_PATTERN = {1, 2, 3, 4, 5};
    private static final int[] B_PATTERN = {2, 1, 2, 3, 2, 4, 2, 5};
    private static final int[] C_PATTERN = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    public static int[] solution(int[] answers) {
        int[][] PatternsArray = {A_PATTERN, B_PATTERN, C_PATTERN};
        int[] scoresArray = gradeExaminationPapers(PatternsArray, answers);
        return rankStudent(scoresArray);
    }

    private static int[] rankStudent(int[] scoresArray) {
        int maxScore = getMaxScore(scoresArray);
        return listToArray(sortStudent(scoresArray, maxScore));
    }

    private static List<Integer> sortStudent(int[] scoresArray, int maxScore) {
        List<Integer> studentList = new ArrayList<>();
        for (int i = 0; i < scoresArray.length; i++) {
            if (maxScore == scoresArray[i]) {
                studentList.add(i + 1);
            }
        }
        return studentList;
    }

    private static int[] listToArray(List<Integer> studentList) {
        int[] tmpArray = new int[studentList.size()];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = studentList.get(i);
        }
        return tmpArray;
    }

    private static int scoringAnswers(int[] pattern, int[] answers) {
        int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (compareAnswer(pattern, answers, i)) {
                score++;
            }
        }
        return score;
    }

    private static boolean compareAnswer(int[] pattern, int[] answers, int idx) {
        if (answers[idx] == pattern[idx % pattern.length]) {
            return true;
        }
        return false;
    }

    private static int[] gradeExaminationPapers(int[][] PatternsArray, int[] answers) {
        int[] tmpArray = new int[PatternsArray.length];
        for (int i = 0; i < PatternsArray.length; i++) {
            tmpArray[i] = scoringAnswers(PatternsArray[i], answers);
        }
        return tmpArray;
    }

    private static int getMaxScore(int[] scoresArray) {
        return Math.max(scoresArray[0], Math.max(scoresArray[1], scoresArray[2]));
    }
}
