package firstweek.mission1.gugudan;

public class PrintGugudan {
    public static void main(String[] args) {
        System.out.println("구구단을 출력합니다.");
        System.out.println("-----------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("   [%d단]   \n", i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d X %d = %2d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
