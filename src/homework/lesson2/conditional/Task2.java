package homework.lesson2.conditional;
/* Task 2)
Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в
переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double n = sc.nextDouble();

        if (Math.abs(10 - m) < (Math.abs(10 - n)))
        System.out.println(m);
        else
        System.out.println(n);
    }
}
