package HomeWork.Cycles;

/* Task 8)
Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
первый и второй члены последовательности равны единицам, а каждый следующий — сумме
двух предыдущих.*/

public class Task8 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int fib;
        System.out.println(" " + a + "\n" + " " + b);
        for (int i = 0; i < 9; i++) {
            fib = a + b;
            System.out.println(" " + fib);
            a = b;
            b = fib;
        }
        System.out.println();
    }
}
