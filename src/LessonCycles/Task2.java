package LessonCycles;

/* Task 2) Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5
7 9 11 13 15 17 … */


public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 56; i+=2) {
            System.out.println(i);
            Thread.sleep(100);
        }
    }
}
