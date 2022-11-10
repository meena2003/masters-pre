package secondweek.mission2.Problem2;

public class Subject{
    private String className;
    private int testScore;

    public Subject(String className, int testScore) {
        this.className = className;
        this.testScore = testScore;
    }

    public String getClassName() {
        return className;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }
}
