package HomeWork.LazyAccumulator;

/* */


import Lesson.List.LinkedList;
import Lesson.List.List;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {

        List list = new LinkedList();
        LazyAccumulator Acc1 = new LazyAccumulator(list);

        Stack stack = new Stack();
        LazyAccumulatorStack Acc2 = new LazyAccumulatorStack(stack);

        Acc1.add(5, (a, b) -> a * b);
        Acc1.add(5, (a, b) -> a - b);

        System.out.println(Acc1.calculate() + "\n");

        Acc2.add(2, (a, b) -> a * b);
        Acc2.add(3, (a, b) -> a - b);

        System.out.println(Acc2.calculate());
    }
}
