package HomeWork.LazyAccumulator;

/* */


import HomeWork.Accumulator2.Operation;

import java.util.Stack;


public class LazyAccumulatorStack {
    private Stack st1;
    private Stack st2;
    private double value;

    LazyAccumulatorStack(Stack stack) {
        this.st1 = stack;
    }

    public void add(double n, Operation operation) {
        st1.push(new Item(n, operation));
    }

    public double calculate() {
        st2 = new Stack();
        for (Object o : st1) {
            st2.push(o);
        }

        for (Object o : st2) {
            value = ((Item)o).operation.apply(value, ((Item)o).value);
        }

        return value;
    }

    private class Item {
        double value;
        Operation operation;

        Item(double value, Operation operation) {
            this.value = value;
            this.operation = operation;
        }
    }
}