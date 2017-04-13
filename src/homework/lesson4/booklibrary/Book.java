package homework.lesson4.booklibrary;


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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (pagesNum != book.pagesNum) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return author != null ? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + pagesNum;
        return result;
    }

    @Override
    public String toString() {
        return title + ", " + author + ", " + pagesNum + " стр.";
    }
}