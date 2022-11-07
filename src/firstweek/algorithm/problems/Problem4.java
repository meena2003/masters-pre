package firstweek.algorithm.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 {
    static final String[] ASCENDING = {"1", "2", "3", "4", "5", "6", "7", "8"};
    static final String[] DESCENDING = {"8", "7", "6", "5", "4", "3", "2", "1"};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] cMjor = bf.readLine().split(" ");

        String firstScale = cMjor[0];
        String result = "";

        if (ASCENDING[0].equals(firstScale)) {
            result = checkAscending(cMjor);
        } else if (DESCENDING[0].equals(firstScale)) {
            result = checkdescending(cMjor);
        } else {
            result = "mixed";
        }

        System.out.println(result);
    }

    public static String checkAscending(String[] cMjor) {
        for (int i = 1; i < cMjor.length; i++) {
            if (!cMjor[i].equals(ASCENDING[i])) {
                return "mixed";
            }
        }
        return "ascending";
    }

    public static String checkdescending(String[] cMjor) {
        for (int i = 1; i < cMjor.length; i++) {
            if (!cMjor[i].equals(DESCENDING[i])) {
                return "mixed";
            }
        }
        return "descending";
    }
}
