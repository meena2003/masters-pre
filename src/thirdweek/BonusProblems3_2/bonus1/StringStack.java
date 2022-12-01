package thirdweek.BonusProblems3_2.bonus1;

public class StringStack implements Stack {
    private String[] stack;
    private int size;

    public StringStack(int capacity) {
        stack = new String[capacity];
        size = 0;
    }

    @Override
    public int length() {
        return size;
    }

    @Override
    public int capacity() {
        return stack.length;
    }

    @Override
    public String pop() {
        String word = stack[size - 1];
        stack[--size] = null;
        return word;
    }

    @Override
    public boolean push(String word) {
        if (stack.length == size) {
            return false;
        }
        stack[size++] = word;
        return true;
    }

    public void printAllElements() {
        StringBuilder sb = new StringBuilder();
        sb.append("스택에 저장된 모든 문자열 팝 : ");
        int index = size;
        for (int i = 0; i < index; i++) {
            sb.append(pop() + " ");
        }
        System.out.println(sb);
    }
}
