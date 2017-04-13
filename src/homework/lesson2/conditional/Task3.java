package homework.lesson2.conditional;
/* Task 3)
В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
либо сообщать, что корней нет. */


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Решаем квадратное уравнение вида:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Введите a, b и c:");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;
        System.out.println("D = " + d);
        if (d > 0) {
            double x1, x2;
            x1 = b * -1 + Math.sqrt(d);
            x2 = b * -1 - Math.sqrt(d);

            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
            else if (d == 0) {
                double x = (b * -1)/2 * a;

                System.out.println("Уравнение имеет единственный корень: x = " + x);
            }
            else
                System.out.println("Уравнение не имеет действительных корней!");


    }

}
