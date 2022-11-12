package secondweek.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
    }

    public static int[] solution(int[] arr, int divisor) {
        List<Integer> answerList = divideNumber(arr, divisor);
        isEmpty(answerList);

        Collections.sort(answerList);
        return listToArray(answerList);
    }

    private static int[] listToArray(List<Integer> answerList) {
        int[] tempAnswer = new int[answerList.size()];
        for (int i = 0; i < tempAnswer.length; i++) {
            tempAnswer[i] = answerList.get(i);
        }
        return tempAnswer;
    }

    private static void isEmpty(List<Integer> answerList) {
        if (answerList.isEmpty()) {
            answerList.add(-1);
        }
    }

    private static List<Integer> divideNumber(int[] arr, int divisor) {
        List<Integer> tempList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            checkNumber(tempList, number, divisor);
        }
        return tempList;
    }

    private static void checkNumber(List<Integer> tempList, int number, int divisor) {
        if (number % divisor == 0) {
            tempList.add(number);
        }
    }
}

//테스트 1 〉	통과 (0.23ms, 65.3MB)
//테스트 2 〉	통과 (0.22ms, 76.8MB)
//테스트 3 〉	통과 (0.31ms, 78MB)
//테스트 4 〉	통과 (0.30ms, 76.6MB)
//테스트 5 〉	통과 (0.34ms, 78MB)
//테스트 6 〉	통과 (2.48ms, 79.2MB)
//테스트 7 〉	통과 (0.51ms, 78.7MB)
//테스트 8 〉	통과 (0.20ms, 76.5MB)
//테스트 9 〉	통과 (0.36ms, 77MB)
//테스트 10 〉	통과 (0.90ms, 73.5MB)
//테스트 11 〉	통과 (0.42ms, 76.9MB)
//테스트 12 〉	통과 (0.30ms, 77.7MB)
//테스트 13 〉	통과 (0.54ms, 79.5MB)
//테스트 14 〉	통과 (0.60ms, 88.8MB)
//테스트 15 〉	통과 (0.54ms, 75.3MB)
//테스트 16 〉	통과 (0.31ms, 72.3MB)

