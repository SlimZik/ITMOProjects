package homework.lesson7.lazy;

/* */


import homework.lesson5.accumulator2.Operation;
import homework.lesson4.linkedlist.List;


public class LazyListAccumulator {
    private List list;
    private double value;

    public LazyListAccumulator(double value, List list) {
        this.list = list;
        this.value = value;
    }

    public void add(double value, Operation operation) {
        list.add(new Item(value, operation));
    }

    public double calculate() {
        for (Object o : list) {
            value = ((Item)o).operation.apply(value, ((Item)o).value);
        }
        return value;
    }

    private class Item {
        double value;
        Operation operation;

        public Item(double value, Operation operation) {
            this.value = value;
            this.operation = operation;
        }
    }
}