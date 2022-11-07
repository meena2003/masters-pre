package secondweek.mission1.problem2;

public class BookList {
    private String name;
    private Book[] bookList;
    private int index;

    public BookList(String name) {
        this.name = name;
        index = 0;
        bookList = new Book[5];
    }

    public void copyBookList(Book[] bookList) {
        System.arraycopy(bookList, 0, this.bookList, 0, bookList.length);
    }

    public void addBook(Book newBook) {
        if (index == bookList.length) {
            bookList = extendsBookArray();
        }
        insertNewBook(newBook);
    }

    private void insertNewBook(Book newBook) {
        bookList[index++] = newBook;
    }

    private Book[] extendsBookArray() {
        Book[] tmpBookArray = new Book[bookList.length + 1];
        System.arraycopy(bookList, 0, tmpBookArray, 0, bookList.length);
        return tmpBookArray;
    }

    public void printBooks() {
        for (Book book : bookList) {
            String title = book.getTitle();
            String author = book.getAuthor();
            System.out.printf("[%s|%s] ", title, author);
        }
    }
}
