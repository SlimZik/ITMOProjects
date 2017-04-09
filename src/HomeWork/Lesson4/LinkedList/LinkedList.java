package HomeWork.Lesson4.LinkedList;


import java.util.Iterator;

public class LinkedList<T> implements List<T>, Stack<T> {
    private Item<T> head;                                                                                               // Указатель на 1-й элемент
    private Item<T> tail;                                                                                               // Указатель на последний элемент
    private int size;

    public void add(T val) {                                                                                            // Добавление элемента в конец
        Item<T> x = new Item<>(val);

        if (head == null) {
            head = x;
            tail = x;
        } else {
            tail.next = x;
            tail = x;
        }
        size++;
    }

    @Override
    public void push(T val) {                                                                                           // Добавление элемента в начало
        Item<T> next = head;

        head = new Item<>(val);
        head.next = next;

        size++;
    }

    @Override
    public T get(int i) {                                                                                               // Взятие элемента по индексу
        if (head == null)
            return null;

        if (i == 0)
            return head.value;

        int count = 1;

        for (Item<T> prev = head; ; ) {
            Item<T> next = prev.next;

            if (next == null)
                return null;

            if (count++ == i)
                return next.value;

            prev = next;
        }
    }

    public T get(T val) {                                                                                               // Поиск элемента по значению
        if (head == null) return null;

        if (head.value.equals(val)) return head.value;

        Item<T> x = head;
        while(x.next != null) {
            if (x.next.value.equals(val)) return x.next.value;
            x = x.next;
        }
        return null;
    }

    @Override
    public T remove(int i) {                                                                                            // Удаление элемента по индексу
        if (head == null)
            return null;

        if (i == 0) {
            Item<T> h = head;
            head = head.next;
            size--;

            return h.value;
        }

        int count = 1;

        for (Item<T> prev = head; ; ) {
            Item<T> next = prev.next;

            if (next == null)

                return null;

            if (count++ == i) {
                if (next.next != null)
                    prev.next = next.next;
                else
                    prev.next = null;
                size--;

                return next.value;
            }
            prev = next;
        }
    }

    @Override
    public T remove(T value) {                                                                                          // Удаление элемента по значению
        if (head == null) return null;                                                                                  // Если список пуст

        if (head == tail) {                                                                                             // Если в списке только один элемент
            Item<T> h = head;
            head = null;
            tail = null;
            size--;

            return h.value;
        }

        if (head.value.equals(value)) {                                                                                 // Если первый элемент - наш, то перекидываем
            Item<T> h = head;                                                                                           // ссылку на следующий за головой элемент
            head = head.next;
            size--;

            return h.value;
        }

        Item<T> x = head;
        while (x.next != null) {                                                                                        // Итерируемся, пока следующий элемент существует
            if (x.next.value.equals(value)) {                                                                           // Проверяем следующий элемент
                Item<T> h = x.next;
                if (tail == x.next) {                                                                                   // Если он последний
                    tail = x;                                                                                           // Перекидываем указатель хвоста на текущий элемент
                }
                x.next = x.next.next;                                                                                   // Перекидываем ссылку через найденный элемент
                size--;
                return h.value;
            }
            x = x.next;                                                                                                 // Иначе шагаем дальше
        }
        return null;
    }

    @Override
    public T poll() {
        return remove(0);
    }

    public void print() {
        Item<T> x = head;

        while (x != null) {
            System.out.println(x);
            x = x.next;
        }
    }
                                                      // ПРОВЕРКИ //

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkedList<?> that = (LinkedList<?>) o;

        return size == that.size && (head != null ? head.equals(that.head) : that.head == null) && (tail != null ? tail.equals(that.tail) : that.tail == null);
    }

    @Override
    public int hashCode() {
        int result = head != null ? head.hashCode() : 0;
        result = 31 * result + (tail != null ? tail.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }

    public int size() {
        return size;
    }

    // НАШ ИТЕМ //

    private static class Item<T> {
        Item<T> next;                                                                                                   // Указатель на следующий элемент
        T value;                                                                                                        // Значение

        Item(T value) {
            this.value = value;
        }
                                                        // ПРОВЕРКИ //
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Item<?> item = (Item<?>) o;

            return (next != null ? next.equals(item.next) : item.next == null) && (value != null ? value.equals(item.value) : item.value == null);
        }

        @Override
        public int hashCode() {
            int result = next != null ? next.hashCode() : 0;
            result = 31 * result + (value != null ? value.hashCode() : 0);
            return result;
        }

        @Override                                                                                                       // Вывод на экран значение Item
        public String toString() {
            return value.toString();
        }
    }

    // НАШ ИТЕРАТОР //

    @Override
    public Iterator<T> iterator() {
        return new LIterator(head);
    }

    public class LIterator implements Iterator<T> {
        Item<T> next;

        LIterator(Item<T> next) {
            this.next = next;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public T next() {
            Item<T> next = this.next;
            this.next = next.next;
            return next.value;
        }
    }
}