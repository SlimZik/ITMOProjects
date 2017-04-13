package homework.lesson4.linkedlist;

/* Исключения */

public class MyExeptions extends RuntimeException {
    public MyExeptions(String message) {
        super(message);
    }

    public MyExeptions(String message, Throwable cause) {
        super(message, cause);
    }
}
