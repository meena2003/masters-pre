package firstweek.mission1.control_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeDices {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nums = br.readLine();
        int firstNum = Integer.parseInt(nums.substring(0, 1));
        int secondNum = Integer.parseInt(nums.substring(2, 3));
        int thirdNum = Integer.parseInt(nums.substring(4, 5));
        int reward = 0;
        boolean isSameFirstAndSecond = firstNum == secondNum ? true : false;
        boolean isSameSecondAndThird = secondNum == thirdNum ? true : false;
        boolean isSameFirstAndThird = firstNum == thirdNum ? true : false;

        if (isSameFirstAndSecond && isSameSecondAndThird) {
            reward = firstNum * 1000 + 10000;
        } else if (isSameFirstAndSecond) {
            reward = firstNum * 100 + 1000;
        } else if (isSameSecondAndThird) {
            reward = secondNum * 100 + 1000;
        } else if (isSameFirstAndThird) {
            reward = firstNum * 100 + 1000;
        } else {
            if (firstNum > secondNum && firstNum > thirdNum) {
                reward = firstNum * 100;
            } else if (secondNum > firstNum && secondNum > thirdNum) {
                reward = secondNum * 100;
            } else {
                reward = thirdNum * 100;
            }
        }

        System.out.println(reward);
    }
}
