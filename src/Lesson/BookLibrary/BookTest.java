package Lesson.BookLibrary;

/* Исполняемая программа */

public class BookTest {
    public static void main(String[] args) {
        BLibrary library = new BLibrary();

        Book b1 = new Book("\"Древний: Возрождение\"", "Тармашев С.", 631);
        Book b2 = new Book("\"Властелин Колец Трилогия\"", "Толкиен Дж.Р.Р.", 812);

        library.put(b1, 3);
        library.put(b2, 1);
        library.get(b2, 1);
        library.get(b1, 1);
        library.get(b1, 3);

        library.showBooks();
    }
}