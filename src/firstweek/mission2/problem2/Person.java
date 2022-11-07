package firstweek.mission2.problem2;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private boolean isMarried;
    private int numberOfChildren;

    public Person(String name, int age, Gender gender, boolean isMarried, int numberOfChildren) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.numberOfChildren = numberOfChildren;
    }

    private String getName() {
        return name;
    }

    private int getAge() {
        return age;
    }

    private Gender getGender() {
        return gender;
    }

    private String isMarried() {
        return isMarried ? "기혼자" : "미혼자";
    }

    private int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void printInformationOfPerson() {
        System.out.printf("이름은 %s이고 나이는 %d살 입니다. 성별은 %s이며, %s 입니다. 자녀는 %d명이 있습니다.",
                getName(), getAge(), getGender(), isMarried(), getNumberOfChildren());
    }
}
