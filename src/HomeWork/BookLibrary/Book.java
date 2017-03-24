package HomeWork.BookLibrary;


public class Book extends BItem {
    private String title;
    private String author;
    private int pagesNum;

    Book(String title, String author, int pagesNum) {
        this.title = title;
        this.author = author;
        this.pagesNum = pagesNum;
    }

    public String getTitle(Book book) {
        return title;
    }

    public String getAuthor(Book book) {
        return author;
    }

    public int getPagesNum(Book book) {
        return pagesNum;
    }

    @Override
    public String toString() {
        return title + ", " + author + ", " + pagesNum + " стр.";
    }
}