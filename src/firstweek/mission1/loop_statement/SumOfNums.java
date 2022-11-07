package firstweek.mission1.loop_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countNums = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        String[] ArrayNums = nums.split("");
        int sum = 0;

        for (int i = 0; i < countNums; i++) {
            sum += Integer.parseInt(ArrayNums[i]);
        }

        System.out.println(sum);
    }
}
