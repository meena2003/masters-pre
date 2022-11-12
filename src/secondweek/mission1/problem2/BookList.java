package secondweek.mission1.problem2;

import java.util.Arrays;

public class BookList {
    private String name;
    private Book[] bookList;
    private int index;

    public Book[] getBookList() {
        return bookList;
    }

    public BookList(String name) {
        this.name = name;
        index = 0;
        bookList = new Book[5];
    }

    public BookList copyBookList() {
        BookList copyedBookList = new BookList(name + "복사본");
        copyedBookList.bookList = this.bookList;
        return copyedBookList;
    }

    public void changesBookTitle(int index, String newTitle) {
        bookList[index - 1].editTitle(newTitle);
    }

    public void changesBookAuthor(int index, String newAuthor) {
        bookList[index - 1].editAuthor(newAuthor);
    }

    public void changesBookInfo(int index, String newTitle, String newAuthor) {
        changesBookTitle(index, newTitle);
        changesBookAuthor(index, newAuthor);
    }

    public void createSameBookList(Book[] bookList) {
        this.bookList = bookList.clone(); // 깊은 복사
        index = bookList.length;
    }

    public void addBook(Book newBook) {
        if (index == bookList.length) {
            bookList = extendsBookList();
        }
        insertNewBook(newBook);
    }

    private void insertNewBook(Book newBook) {
        bookList[index++] = newBook;
    }

    private Book[] extendsBookList() {
        Book[] tmpBookArray = new Book[bookList.length + 1];
        System.arraycopy(bookList, 0, tmpBookArray, 0, bookList.length);
        return tmpBookArray;
    }

    public void printBooks() {
        System.out.print(name + " : ");
        for (Book book : bookList) {
            System.out.printf("[%s|%s] ", book.getTitle(), book.getAuthor());
        }
        System.out.println();
    }
}
