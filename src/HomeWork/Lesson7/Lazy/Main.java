package HomeWork.Lesson7.Lazy;


import HomeWork.Lesson4.LinkedList.LinkedList;
import HomeWork.Lesson4.LinkedList.List;
import HomeWork.Lesson4.LinkedList.Stack;
import HomeWork.Lesson6.ArrayList;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();
        LazyListAccumulator Acc1 = new LazyListAccumulator(5, list);

        Stack stack = new LinkedList();
        LazyStackAccumulator Acc2 = new LazyStackAccumulator(5, stack);




        Acc1.add(5, (a, b) -> a * b);
        Acc1.add(5, (a, b) -> a - b);

        System.out.println("Калькуляция List: ");
        System.out.println(Acc1.calculate() + "\n");

        Acc2.add(2, (a, b) -> a * b);
        Acc2.add(3, (a, b) -> a - b);

        System.out.println("Калькуляция Stack: ");
        System.out.println(Acc2.calculate());
    }
}
