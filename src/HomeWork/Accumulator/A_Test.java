package HomeWork.Accumulator;

/* Программа Аккумулятор */
public class A_Test {
    public static void main(String[] args) {


        Accumulator accumulator1 = new Accumulator(0, new A_Plus());      // значение value плюсуется со значением которое указываем в "а:"

        accumulator1.calculate(10.5);
        accumulator1.calculate(15);

        System.out.println("Сумма: " + accumulator1.getValue());

        Accumulator accumulator2 = new Accumulator(5, new A_Mul());       // значение value умножается на значение которое указываем в "а:"

        accumulator2.calculate(9.2);
        accumulator2.calculate(9);

        System.out.println("Сумма: " + accumulator2.getValue());

        Accumulator accumulator3 = new Accumulator(3, new A_Pow());       // значение value возводится в значение которое указываем в "а:"

        accumulator3.calculate(2);
        accumulator3.calculate(2);

        System.out.println("Сумма: " + accumulator3.getValue());
    }
}
