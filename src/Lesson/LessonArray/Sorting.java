package Lesson.LessonArray;

/* Задание - 2 Сортировка пузырьком */

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        System.out.println((char) 27 + "[35mВыводим массив на экран");
        int[] array = {8, 10, 5, 0, -4, 33, 8};

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
