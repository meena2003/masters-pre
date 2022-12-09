package fourthWeek.bonusProblems4_1.bonus2;

import java.util.HashMap;
import java.util.Map;

public class Population {
    private Map<String, String> population;

    public Population() {
        population = new HashMap<>();
    }

    public void addElement(String country, String count) {
        population.put(country, count);
    }

    public void getPopulation(String country) {
        if (!population.containsKey(country)) {
            System.out.println(country + " 나라는 없습니다.\n");
            return;
        }
        System.out.println(country + "의 인구는 " + population.get(country) + "\n");
    }
}
