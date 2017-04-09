package HomeWork.Lesson5.Accumulator2;



/* Программа Аккумулятор */

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {

        System.out.println("Массив чисел: ");
        double[] values = {20, 5, 17, 55.5, 80, 100};
        Operation[] operation = {new Plus(), new Minus(), new Divide(), new Mod(), new Pow(), new SquareRoot()};

        Accumulator acc = new Accumulator(values, operation);

        System.out.println(Arrays.toString(acc.getValue()));

        System.out.println("Проведенные операции: ");

        acc.calculate(2);

        System.out.println(Arrays.toString(acc.getValue()));

    }
}
