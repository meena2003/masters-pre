package fourthWeek.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Problem1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                answer[0] = i;
                answer[1] = map.get(nums[i]);
                break;
            }

            map.put(nums[i], i);
            }

        return answer;
    }
}


