package Lesson.List;


import java.util.Iterator;

public class LinkedList implements List, LinkedListStack {
    private LItem head;

    public void push(Object val) {                          // Реализация Stack <--- положим
        LItem next = head;

        head = new LItem(val);

        head.next = next;
    }

    public Object poll() {
        return remove(0);
    }           // Реализация Stack ---> заберем
// Добавляем объект
    public void add(Object Object) {
        if (head == null) {
            head = new LItem(Object);

            return;
        }

        for (LItem prev = head;;) {
            LItem next = prev.next;

            if (next == null) {
                prev.next = new LItem(Object);

                return;
            }

            prev = next;
        }
    }
// Взятие по индексу ---------
    public Object get(int i) {
        if (head == null)
            return null;

        if (i == 0)
            return head.value;

        int cnt = 1;

        for (LItem prev = head;;) {
            LItem next = prev.next;

            if (next == null)
                return null;

            if (cnt++ == i)
                return next.value;

            prev = next;
        }
    }
// Удаление по индексу ----------
    public Object remove(int i) {
        if (head == null)
            return null;

        if (i == 0) {
            LItem h = head;

            head = head.next;

            return h.value;
        }

        int cnt = 1;

        for (LItem prev = head;;) {
            LItem next = prev.next;

            if (next == null)
                return null;

            if (cnt++ == i) {
                if (next.next != null)
                    prev.next = next.next;
                else
                    prev.next = null;

                return next.value;
            }

            prev = next;
        }
    }
// Итератор --------------------------------------------------
    @Override
    public Iterator iterator() {return new ListIterator(head);}
// Вложенный класс Итем ------------------------------------------------------
    private static class LItem {
        Object value;
        LItem next;

        LItem(Object value) {
            this.value = value;
        }
    }
// Вложенный класс Итератор -------------------------------
    private static class ListIterator implements Iterator {
        private LItem next;

        ListIterator(LItem next) {
            this.next = next;
        }
        @Override
        public boolean hasNext(){
            return next != null;
        }
        @Override
        public Object next(){
            LItem next = this.next;
            this.next = next.next;
            return next.value;
        }
    }
}
