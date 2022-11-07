package firstweek.mission1.control_statement;

import java.util.*;

public class TestScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        System.out.println(solution(score));
    }

    public static char solution(int score) {
        if (90 <= score) {
            return 'A';
        } else if (80 <= score && score <= 89) {
            return 'B';
        } else if (70 <= score && score <= 79) {
            return 'C';
        } else if (60 <= score && score <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
