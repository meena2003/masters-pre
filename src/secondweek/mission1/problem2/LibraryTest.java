package secondweek.mission1.problem2;

import java.util.Arrays;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book("태백산맥", "조정래");
        Book book2 = new Book("이기적 유전자", "리처드 도킨즈");
        Book book3 = new Book("자전거 도둑", "박완서");
        Book book4 = new Book("토지", "박경리");
        Book book5 = new Book("대변동", "제레드 다이아몬드");

        BookList A = new BookList("온마을");  //  A 책목록 인스턴스 생성
        A.addBook(book1);
        A.addBook(book2);
        A.addBook(book3);
        A.addBook(book4);
        A.addBook(book5);

        BookList A1 = new BookList("온마을 복사본");
        A1.copyBookList(A.getBookList());  // A 책목록 복사


        BookList B = new BookList("두마을");  //  B 책목록 인스턴스 생성
        B.addBook(book1);
        B.addBook(book2);
        B.addBook(book3);
        B.addBook(book4);
        B.addBook(book5);

        Book book6 = new Book("사피엔스", "유발 하라리");  // 새로운 book 인스턴스 생성
        B.addBook(book6); // 책 추가

        A.printBooks();
        A1.printBooks();
        B.printBooks();

    }
}
