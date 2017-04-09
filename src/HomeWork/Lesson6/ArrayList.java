package HomeWork.Lesson6;

/* ArrayList */


import HomeWork.Lesson4.LinkedList.List;
import java.util.Iterator;


public class ArrayList<T> implements List<T> {                                                                          // Хранилище значений elementData есть ни что иное
    private Object[] elementData;                                                                                       // как массив определенного типа (указанного в generic).
    private static final int capacity = 10;                                                                             // Вместимость по умолчанию
    private int size;

    public ArrayList() {
        this.elementData = new Object[capacity];
    }
    // СМ. МЕТОДЫ LIST //
    @Override
    public void add(T o) {
        if (size + 1 <= capacity) {
            elementData[size++] = o;

            return;
        }
        Object[] tmp = new Object[size * 2];
        System.arraycopy(elementData, 0, tmp, 0, size);                                                    // Копирование массива
        elementData = tmp;
        elementData[size++] = o;
    }

    // СМ. МЕТОДЫ LIST //
    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        return (T) elementData[index];
    }
    // СМ. МЕТОДЫ LIST //
    @SuppressWarnings("unchecked")
    @Override
    public T get(Object value) {
        for (Object tmp : elementData) {
            if (value.equals(tmp)) return (T) value;
        }
        return null;
    }

    // СМ. МЕТОДЫ LIST //
    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index) {
        Object oldValue = elementData[index];
        int numMoved = size - index - 1;
        System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
        return (T) oldValue;
    }
    // СМ. МЕТОДЫ LIST //
    @SuppressWarnings("unchecked")
    @Override
    public T remove(T value) {
        Object oldValue;
        for (int i = 0; i < elementData.length; i++) {
            if (value.equals(elementData[i])) {
                oldValue = elementData[i];
                this.remove(i);
                return (T) oldValue;
            }
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator(elementData);
    }

    public int size() {
        return size;
    }

    //НАШ ИТЕРАТОР //
    private class ArrayListIterator implements Iterator<T> {
        private Object[] array;
        private int index = 0;

        ArrayListIterator(Object[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < array.length && array[index] != null;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            return (T) array[index++];
        }
    }
}