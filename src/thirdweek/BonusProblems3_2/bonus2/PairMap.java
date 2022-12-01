package thirdweek.BonusProblems3_2.bonus2;

public abstract class PairMap{
    protected String keyArray[];
    protected String valueArray[];
    protected int size;
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);
    abstract int length();
}
