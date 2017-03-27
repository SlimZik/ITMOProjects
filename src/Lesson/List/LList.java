package Lesson.List;


import java.util.Iterator;

public class LList implements List, LStack {
    private LItem head;

    public void push(Object val) {                          // Реализация Stack
        LItem next = head;

        head = new LItem(val);

        head.next = next;
    }

    public Object poll() {
        return remove(0);
    }           // Реализация Stack

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

    @Override
    public Iterator iterator() {
        return new ListIterator(head);
    }
}