package firstweek.mission1.control_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OvenTimer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String startTime = br.readLine();

        int pos = startTime.indexOf(" ");
        int hour = Integer.parseInt(startTime.substring(0, pos));
        int minute = Integer.parseInt(startTime.substring(pos + 1));
        int setTime = Integer.parseInt(br.readLine());

        int plusHour = setTime / 60;
        int plusMinute = setTime % 60;

        if (60 <= minute + plusMinute) {
            plusHour++;
            minute = (minute + plusMinute) - 60;
        } else {
            minute += plusMinute;
        }

        System.out.println(((hour + plusHour) % 24) + " " + minute);
    }
}
