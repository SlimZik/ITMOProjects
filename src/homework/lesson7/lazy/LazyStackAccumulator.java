package homework.lesson7.lazy;


import homework.lesson4.linkedlist.LinkedList;
import homework.lesson4.linkedlist.Stack;
import homework.lesson5.accumulator2.Operation;

public class LazyStackAccumulator {
    Stack stack1;
    double Value;
    double Count;

    public LazyStackAccumulator(int value, Stack stack) {
        this.Value = value;
        this.stack1 = stack;
    }

    public void add(int value, Operation operation) {
        Item item = new Item(value, operation);
        stack1.push(item);
        Count++;
    }

    public double calculate() {
        Stack stack2 = new LinkedList<>();
        Object o;
        while ((o = stack1.poll()) != null) {
            stack2.push(o);
        }
        while ((o = stack2.poll()) != null) {
            Value = ((Item) o).operation.apply(Value, ((Item) o).value);
        }
        return Value;
    }

    private static class Item {
        int value;
        Operation operation;

        Item(int value, Operation operation) {
            this.value = value;
            this.operation = operation;
        }
    }
}