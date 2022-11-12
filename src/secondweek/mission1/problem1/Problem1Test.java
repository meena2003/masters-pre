package secondweek.mission1.problem1;

public class Problem1Test {
    static String[] alphabetArray = new String[26];
    public static void main(String[] args) {
        addAlphabets();
        printAlphabets();
    }

    private static void addAlphabets() {
        char alphabet = 65;
        for (int i = 0; i < alphabetArray.length; i++) {
            alphabetArray[i] = String.valueOf(alphabet++);
        }
    }

    private static void printAlphabets() {
        for (String alphabet : alphabetArray) {
            System.out.print(alphabet);
        }
    }
}
