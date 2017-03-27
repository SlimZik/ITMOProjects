package HomeWork.Accumulator2;



/* Программа Аккумулятор */

import java.util.Arrays;

public class A_Test {
    
    public static void main(String[] args) {

        System.out.println("Массив чисел: ");
        double[] values = {20, 5, 17, 55.5, 80, 100};
        A_Operation[] operation = {new A_Plus(), new A_Minus(), new A_Divide(), new A_Mod(), new A_Pow(), new A_SquareRoot()};

        Accumulator acc = new Accumulator(values, operation);

        System.out.println(Arrays.toString(acc.getValue()));

        System.out.println("Проведенные операции: ");

        acc.calculate(2);

        System.out.println(Arrays.toString(acc.getValue()));

    }
}
