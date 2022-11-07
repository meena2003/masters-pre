package firstweek.mission1.control_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String setTime = br.readLine();
        int pos = setTime.indexOf(" ");
        int hour = Integer.parseInt(setTime.substring(0, pos));
        int minute = Integer.parseInt(setTime.substring(pos + 1));

        if (45 <= minute) {
            minute -= 45;
        } else if (0 == hour && minute < 45) {
            hour = 23;
            minute = 60 - (45 - minute);
        } else if (0 < hour && minute < 45) {
            hour--;
            minute = 60 - (45 - minute);
        }
        System.out.println(hour + " " + minute);
    }
}
