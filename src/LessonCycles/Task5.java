package LessonCycles;

/* Task 5)
Создайте программу, вычисляющую факториал натурального числа n, которое
пользователь введёт с клавиатуры.
*/

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int x = sc.nextInt();
        System.out.println("Факториал вашего числа: " + factorial(x));
    }

    private static int factorial(int x){            //нерекурсивное решение
        int n = 1;
        for (int i = 1; i <= x; ++i) n *= i;
        return n;

    }
}