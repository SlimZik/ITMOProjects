package HomeWork.ArrayList;

import java.util.Iterator;

/* Итератор для ArrayList */

public class ArrayIterator implements Iterator {

    private Object[] array;
    private int index = 0;
    private int size;

    ArrayIterator(Object[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length && array[index] != null;
    }

    @Override
    public Object next() {
        return array[index++];
        }
    }
