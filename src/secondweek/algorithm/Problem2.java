package secondweek.algorithm;

import java.util.*;

public class Problem2 {
    static Stack<Integer> dollBasket = new Stack<>();
    static int count = 0;

    public static int solution(int[][] board, int[] moves) {
        playGame(board, moves);
        return count;
    }

    private static void playGame(int[][] board, int[] moves) {
        for (int move : moves) {
            int doll = pickOneDoll(board, move);
            if (doll == 0) {
                continue;
            }
            saveDollToBasket(doll);
        }
    }

    private static int pickOneDoll(int[][] board, int move) {
        int doll = 0;
        for (int i = 0; i < board.length; i++) {
            int position = board[i][move - 1];
            if (position == 0) {
                continue;
            }
            doll = position;
            board[i][move - 1] = 0;
            break;
        }
        return doll;
    }

    private static void saveDollToBasket(int doll) {
        if (isEmpty(doll)) {
            return;
        }
        if (popDolls(doll)) {
            return;
        }
        addDoll(doll);
    }

    private static boolean popDolls(int doll) {
        if (dollBasket.peek() == doll) {
            dollBasket.pop();
            count += 2;
            return true;
        }
        return false;
    }

    private static boolean isEmpty(int doll) {
        if (dollBasket.isEmpty()) {
            dollBasket.push(doll);
            return true;
        }
        return false;
    }

    private static void addDoll(int doll) {
        dollBasket.push(doll);
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));
    }
}