package fourthWeek.bonusProblems4_1.bonus2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Population population = new Population();
        Scanner scan = new Scanner(System.in);

        System.out.print("나라 이름과 인구를 입력하세요. (예: Korea 5000)\n");
        while (true) {
            System.out.print("나라 이름, 인구 >> ");
            String str = scan.nextLine();
            if (str.equals("그만")) {
                break;
            }
            population.addElement(str.split(" ")[0], str.split(" ")[1]);
        }
        System.out.println();

        while (true) {
            System.out.print("인구 검색 >> ");
            String country = scan.nextLine();
            if (country.equals("그만")) {
                break;
            }
            population.getPopulation(country);
        }
    }
}
