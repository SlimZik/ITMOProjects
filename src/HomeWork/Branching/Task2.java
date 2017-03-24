package HomeWork.Branching;
/* Task 2)
Создать программу, выводящую на экран случайно сгенерированное трёхзначное
натуральное число и его наибольшую цифру.Примеры работы программы:
В числе 208 наибольшая цифра 8В числе 774 наибольшая цифра 7В числе 613 наибольшая
цифра 6
*/


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rn = new Random();
        int a = rn.nextInt(899) + 100;
        System.out.println("Наше число: " + a);

        String s = Integer.toString(a);
        char[] arr = s.toCharArray();
        int max = 0;
        for (char ch : arr) {
            int n = Character.digit(ch, 10);
            if (n > max) max = n;
        }
        System.out.println(max);
    }

}
