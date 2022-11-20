package secondweek.BonusProblems2_1.Bonus1;

import java.util.*;

public class WordsManagementSystem {
    public static final String FIRST_WORD = "기러기";
    private Stack<String> wordsStack;
    private List<String> wordsList;

    public WordsManagementSystem() {
        wordsStack = new Stack<>();
        wordsStack.push(FIRST_WORD);
        wordsList = new ArrayList<>();
        wordsList.add(FIRST_WORD);
    }

    public boolean compareWord(String nextWord) {
        String lastCharacterOfPreWord = wordsStack.peek().substring(wordsStack.peek().length() - 1);
        String firstCharacterOfNextWord = nextWord.substring(0, 1);
        if (lastCharacterOfPreWord.equals(firstCharacterOfNextWord)) {
            wordsStack.push(nextWord);
            return true;
        }
        return false;
    }

    public boolean isDuplicatedWord(String nextWord) {
        if (wordsList.contains(nextWord)) {
            System.out.println("중복 단어를 입력했습니다.");
            return false;
        }
        wordsList.add(nextWord);
        return true;
    }

    public boolean isOneCharacter(String nextWord) {
        if (nextWord.length() == 1) {
            System.out.println("한 글자는 단어가 아닙니다.");
            return false;
        }
        return true;
    }
}
