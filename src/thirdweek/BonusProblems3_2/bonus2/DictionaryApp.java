package thirdweek.BonusProblems3_2.bonus2;

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("Shine", "자바");
        dic.put("Silver", "파이선");
        dic.put("Silver", "C++");

        System.out.println("Silver의 값은 " + dic.get("Silver"));
        System.out.println("Shine의 값은 " + dic.get("Shine"));

        dic.delete("Shine");

        System.out.println("Shine의 값은 " + dic.get("Shine"));
    }
}
