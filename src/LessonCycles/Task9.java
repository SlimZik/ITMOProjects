package LessonCycles;

/* Task 9)
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех
его цифр (заранее не известно сколько цифр будет в числе). */


import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws Exception {
        int x;
        int sum = 0;

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        x = scn.nextInt();
        while (x != 0) {
            sum = sum + (x % 10);
            x /= 10;
        }
        System.out.println("Сумма введенных чисел = " + sum);
    }
}