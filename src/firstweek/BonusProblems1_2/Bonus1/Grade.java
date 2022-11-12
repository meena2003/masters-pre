package firstweek.BonusProblems1_2.Bonus1;

public class Grade {
    private int mathScore;
    private int scienceScore;
    private int englishScore;

    public Grade(int mathScore, int scienceScore, int englishScore) {
        this.mathScore = mathScore;
        this.scienceScore = scienceScore;
        this.englishScore = englishScore;
    }

    public int scoreAverage() {
        int averageScore = (mathScore + scienceScore + englishScore) / 3;
        return averageScore;
    }
}
