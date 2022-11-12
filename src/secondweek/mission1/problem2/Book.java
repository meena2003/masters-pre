package secondweek.mission1.problem2;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void editTitle(String newTitle) {
        this.title = newTitle;
    }

    public void editAuthor(String newAuthor) {
        this.author = newAuthor;
    }
}
