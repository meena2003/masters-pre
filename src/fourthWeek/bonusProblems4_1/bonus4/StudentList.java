package fourthWeek.bonusProblems4_1.bonus4;

import java.util.*;

public class StudentList {
    private Map<String, Double> list;

    public StudentList() {
        list = new HashMap<>();
    }

    public void addStudent(String name, Double score) {
        list.put(name, score);
    }

    public void printList(double standard) {
        String student = "";

        List<String> ketSet = new ArrayList<>(list.keySet());

        ketSet.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return list.get(o1).compareTo(list.get(o2));
            }
        });

        for (String key : ketSet) {
            if (list.get(key) >= standard) {
                student += key + " ";
            }
        }
        System.out.println();
        System.out.println("장학생 명단 : " + student);
    }
}
