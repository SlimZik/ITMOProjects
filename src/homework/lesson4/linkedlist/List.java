package homework.lesson4.linkedlist;

/* Интерфейс List  */

public interface List<T> extends Iterable<T> {

    void add(T o);

    T get(int index);

    T get(T o);

    T remove(int index);

    T remove(T o);

    int size();
}
