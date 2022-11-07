package firstweek.mission2.Problem3;

public class Problem3 {
    public static void main(String[] args) {
        Drink americano = new Drink("아메리카노", 4000);
        Drink latte = new Drink("라떼", 5000);
        Drink mocha = new Drink("카페모카", 5500);
        Drink cappuccino = new Drink("카푸치노", 6000);
        Drink special = new Drink("스페셜음료", 15000);

        Cafe starCafe = new Cafe("별다방", americano, latte, mocha, cappuccino); // 생성자에서 한번에 메뉴 등록
        starCafe.getMenu();  // 메뉴 보기
        starCafe.addMenu(special);  // 스페셜 음료 추가
        starCafe.getMenu();  // 메뉴 보기

        Cafe kongCafe = new Cafe("콩카페"); // 일단 카페만 생성
        kongCafe.getMenu(); // 메뉴 보기
        kongCafe.addMenu(americano);
        kongCafe.addMenu(mocha);
        kongCafe.getMenu(); // 메뉴 보기


//        Person james = new Person("James", 5000);
//        Person tomas = new Person("Tomas", 10000);
//
//        james.buyDrink(starCafe, "아메리카노");
//        tomas.buyDrink(kongCafe, "라떼");
//        tomas.buyDrink(kongCafe, "아메리카노");
    }
}
