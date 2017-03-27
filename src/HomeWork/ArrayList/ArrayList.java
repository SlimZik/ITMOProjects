package HomeWork.ArrayList;

/* ArrayList */


import java.util.Iterator;

public class ArrayList implements AList {                     // Хранилище значений elementData есть ни что иное как массив определенного типа (указанного в generic).

    private Object[] elementData;
    private int capacity = 10;                                // По умолчанию вместимость всегда 10
    private int size;

    ArrayList() {
        this.elementData = new Object[capacity];              // Новый массив с указанным значением capacity
    }

    @Override
    public void add(Object o) {                               // Добавляем объект
        if (size + 1 <= capacity) {
            elementData[size++] = o;

            return;
        }
        Object[] tmp = new Object[size * 2];
        System.arraycopy(elementData, 0, tmp, 0, size);                         //Сохранение массива
        elementData = tmp;
        elementData[size++] = o;
    }

    @Override
    public Object get(int index) {
        return elementData[index];
    }

    @Override
    public Object remove(int index) {
        Object oldValue = elementData[index];
        int numMoved = size - index - 1;
        System.arraycopy(elementData, index + 1, elementData, index, numMoved);       //Сохранение массива
        elementData[--size] = null;
        return oldValue;
    }

    @Override
    public Iterator iterator() {                                                            // Итератор - итератор
        return new ArrayIterator(elementData);
    }

    public int size() {
        return size;
    }
}


