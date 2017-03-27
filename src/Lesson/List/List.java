package Lesson.List;

/* Интерфейс List  */

public interface List extends Iterable {

    void add(Object o);

    Object get(int index);

    Object remove(int index);
}
