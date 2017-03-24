package HomeWork.MultiArray;

import java.util.Random;

/* Task 3)
    Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из
отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с
наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести
индекс первой встретившейся из них.
*/

public class Task3 {
    public static void main(String[] args) {
        int index, a = 0, b = 0;
        int[][] MultiArr = new int[7][4];
        Random rnd = new Random();
        System.out.println("Выводим массив на экран: ");

        for (int i = 0; i < MultiArr.length; i++) {
            index = 1;
            for (int j = 0; j < MultiArr[i].length; j++) {
                MultiArr[i][j] = rnd.nextInt(10) - 5;
                System.out.print(MultiArr[i][j] + " ");
                index *= Math.abs(MultiArr[i][j]);
            }
            MultiArr[i][0] = index;                     //записываем в нулевую ячейку строки
            System.out.println();                       //разделяем строки
            if (b < MultiArr[i][0]) {                   //ищем строку с максимальным произведением элементов
                b = MultiArr[i][0];
                a = i;                                  //запоминаем индекс и продолжаем внешний цикл
            }
        }
        System.out.println("Индекс строки наибольшего произведения: " + a);
    }
}
