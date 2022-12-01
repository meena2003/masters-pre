package thirdweek.BonusProblems3_2.bonus2;

import java.util.Objects;

public class Dictionary extends PairMap {

    public Dictionary(int capacity) {
        keyArray = new String[capacity];
        valueArray = new String[capacity];
        size = 0;
    }

    @Override
    void put(String key, String value) {
        int index = makeIndex(key);
        if (keyArray[index] == null) {
            keyArray[index] = key;
            valueArray[index] = value;
            size++;
            return;
        }
        valueArray[index] = value;
    }

    @Override
    String delete(String key) {
        int index = makeIndex(key);
        String value = valueArray[index];
        keyArray[index] = null;
        valueArray[index] = null;
        size--;
        return value;
    }

    @Override
    String get(String key) {
        int index = makeIndex(key);
        if (keyArray[index] != null) {
            return valueArray[index];
        }
        return null;
    }

    @Override
    int length() {
        return size;
    }

    private int makeIndex(String str) {
        return hashCode(str) % keyArray.length;
    }

    private int hashCode(String str) {
        return (str.charAt(0) * 16) + str.length() + (str.charAt(str.length() - 1) * 9);
    }
}
