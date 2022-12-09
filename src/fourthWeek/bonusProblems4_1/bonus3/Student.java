package fourthWeek.bonusProblems4_1.bonus3;

public class Student {
    private String name;
    private String major;
    private String code;
    private String score;

    public Student(String name, String major, String code, String score) {
        this.name = name;
        this.major = major;
        this.code = code;
        this.score = score;
    }

    public void printAllInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n이름: %s\n", name))
                .append(String.format("학과: %s\n", major))
                .append(String.format("학번: %s\n", code))
                .append(String.format("학점평균: %s\n", score));
        System.out.println(sb);
    }

    public void printInfo() {
        System.out.printf("%s, %s, %s, %s", name, major, code, score);
    }

    public String getName() {
        return name;
    }
}
