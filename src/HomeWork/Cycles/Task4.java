package HomeWork.Cycles;

/* Task 4) Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8
16 32 64 128 … */

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        int x = 1;
        for (int i = 0; i < 20; i++) {
            x *= 2;
            System.out.println(x);
            Thread.sleep(100);
        }

    }
}
