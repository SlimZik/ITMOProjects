package HomeWork.Accumulator1;

/* Программа Аккумулятор */
public class Main {
    public static void main(String[] args) {


        Accumulator accumulator1 = new Accumulator(25.5, new Mod());      // значение value плюсуется со значением которое указываем в "а:"

        accumulator1.calculate(5);

        System.out.println("Сумма: " + accumulator1.getValue());

        Accumulator accumulator2 = new Accumulator(5, new Mul());       // значение value умножается на значение которое указываем в "а:"

        accumulator2.calculate(9.2);

        System.out.println("Сумма: " + accumulator2.getValue());

        Accumulator accumulator3 = new Accumulator(0, new SquareRoot());       // значение value возводится в значение которое указываем в "а:"

        accumulator3.calculate(10);

        System.out.println("Сумма: " + accumulator3.getValue());

        Accumulator accumulator4 = new Accumulator(5, new Operation() {

            @Override
            public int apply(int a1, int a2) {
                return a1 + a2;
            }

            @Override
            public double apply(double a1, double a2) {
                return a1 * a2;
            }

            @Override
            public long apply(long a, long b) {
                return a - b;
            }
        });

        accumulator4.calculate(20);

        System.out.println("\n" + accumulator4.getValue());
    }
}
