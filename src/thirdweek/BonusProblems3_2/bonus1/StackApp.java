package thirdweek.BonusProblems3_2.bonus1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackApp {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("총 스택 저장 공간의 크기 입력 >> ");
        StringStack stringStack = new StringStack(Integer.parseInt(bf.readLine()));
        while (true) {
            System.out.print("문자열 입력 >> ");
            String word = bf.readLine();
            if (word.equals("그만")) {
                stringStack.printAllElements();
                break;
            }
            if(!stringStack.push(word)) {
                System.out.println("스택이 꽉 차서 push 불가!");
            }
        }
    }
}
