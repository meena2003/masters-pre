package fourthWeek.algorithm;

import java.util.Arrays;

public class Problem2 {

    public static void main(String[] args) {
        System.out.println(reverse(1241547823));
    }

    public static int reverse(int x) {
        boolean isSign = false;
        String number = String.valueOf(x);
        if (String.valueOf(x).charAt(0) == '-') {
            isSign = true;
            number = number.substring(1);
        }

        String[] strArray = number.split("");

        StringBuilder sb = new StringBuilder();
        if (isSign) {
            sb.append("-");
        }
        for (int i = strArray.length - 1; i >= 0; i--) {
            sb.append(strArray[i]);
        }

        try {
            return Integer.parseInt(new String(sb));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

