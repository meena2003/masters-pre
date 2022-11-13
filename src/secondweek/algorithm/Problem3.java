package secondweek.algorithm;


import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> answerSet = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i; j < numbers.length - 1; j++) {
                answerSet.add(numbers[i] + numbers[j + 1]);
            }
        }

        int[] result = new int[answerSet.size()];
        Iterator<Integer> it = answerSet.iterator();

        int idx = 0;
        while (it.hasNext()) {
            result[idx++] = it.next();
        }

        return result;
    }
}
