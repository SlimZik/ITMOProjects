package Lesson.List;

import java.util.Iterator;

/*  */

public class ListIterator implements Iterator {
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
