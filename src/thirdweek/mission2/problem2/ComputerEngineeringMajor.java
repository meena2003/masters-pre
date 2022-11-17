package thirdweek.mission2.problem2;

public class ComputerEngineeringMajor extends Major {

    public ComputerEngineeringMajor(String majorName) {
        super(majorName);
        getCompulsorySubject(majorName);
    }

    @Override
    void getCompulsorySubject(String majorName) {
        if (majorName.equals("컴퓨터공학과")) {
            compulsorySubject = "수학";
        }
    }
}
