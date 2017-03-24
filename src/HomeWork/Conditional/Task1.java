package HomeWork.Conditional;
/* Task 1)
Создать программу, проверяющую и сообщающую на экран, является ли целое число
записанное в переменную n, чётным либо нечётным.*/


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String type = n % 2 == 0 ? "even" : "odd";

        System.out.println(type);

    }

}
