package HomeWork.LazyAccumulator;

/* */


import HomeWork.Accumulator2.Operation;
import Lesson.List.List;


public class LazyAccumulator {
    private List list;
    private double value;

    public LazyAccumulator(List list) {
        this.list = list;
    }

    public void add(double n, Operation operation) {
        list.add(new Item(n, operation));
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
