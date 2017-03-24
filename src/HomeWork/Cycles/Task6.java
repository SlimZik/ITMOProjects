package HomeWork.Cycles;

/* Task 6)
Выведите на экран все положительные делители натурального числа, введённого
пользователем с клавиатуры.*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int x = scn.nextInt();
            if (x == 0)
                System.out.println("На ноль делить нельзя!!!");
            else
        System.out.println("Положительные делители введенного числа: ");
        for (int i = 1; i <= x; i++) {
            if (x % i == 0)
                System.out.println(i);
        }

    }
}
