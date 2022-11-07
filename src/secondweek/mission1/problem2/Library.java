package secondweek.mission1.problem2;

public class Library {
    private String name;
    private Book[] bookshelf;
    private Book[] alternativeBookshelf;

    public Library(String name) {
        this.name = name;
        bookshelf = new Book[5];
    }

    public void copyBooks() {
        System.arraycopy(bookshelf, 0, alternativeBookshelf, 0, bookshelf.length);
    }


}
