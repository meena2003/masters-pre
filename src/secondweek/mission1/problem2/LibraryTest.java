package secondweek.mission1.problem2;

public class LibraryTest {
    public static void main(String[] args) {

        BookList A = new BookList("온마을");  //  A 책목록 인스턴스 생성
        A.addBook(new Book("태백산맥", "조정래"));
        A.addBook(new Book("이기적 유전자", "리처드 도킨즈"));
        A.addBook(new Book("자전거 도둑", "박완서"));
        A.addBook(new Book("토지", "박경리"));
        A.addBook(new Book("대변동", "제레드 다이아몬드"));

        BookList A1 = A.copyBookList();  // A 책목록을 얕은 복사해서 A1 생성

        BookList B = new BookList("두마을");  //  B 책목록 인스턴스 생성
        B.createSameBookList(A.getBookList());  // A 책목록을 깊은 복사해서 B에 저장

        System.out.println("===== 정보 변경 전 =====");
        A.printBooks();
        A1.printBooks();
        B.printBooks();

        A.changesBookTitle(3, "그 많던 상아는 누가 다 먹었을까");
        B.addBook(new Book("사피엔스", "유발 하라리")); // 책 추가

        System.out.println("===== 정보 변경 후 =====");
        A.printBooks();
        A1.printBooks();
        B.printBooks();
    }
}
