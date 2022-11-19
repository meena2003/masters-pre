package thirdweek.algorithm;

import java.io.*;

class Result5 {

    public static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isAm = s.substring(8).equals("AM") ? true : false;
        int hour = Integer.parseInt(s.substring(0, 2));
        String minuteAndSecond = s.substring(2, 8);

        if (isAm && hour == 12) {
            sb.append("00").append(minuteAndSecond);
            return new String(sb);
        }
        if (isAm) {
            return String.format("%02d%s", hour, minuteAndSecond);
        }
        if (hour == 12) {
            sb.append("12").append(minuteAndSecond);
            return new String(sb);
        }

        return String.format("%02d%s", hour + 12, minuteAndSecond);
    }
}

public class Problem5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result5.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

