package secondweek.algorithm;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {

    }

    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int point;
        int count = 0;

        for (int i = 0; i < moves.length; i++) {
            point = moves[i] - 1;
            int j = 0;

            while (j < board.length) {
                if (board[j][point] != 0) {
                    if (!basket.isEmpty() && basket.peek() == board[j][point]) {
                        basket.pop();
                        count += 2;
                        break;
                    }
                    basket.push(board[j][point]);
                    board[j][point] = 0;
                    break;
                }
                j++;
            }
        }
        return count;
    }
}