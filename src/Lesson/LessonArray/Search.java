package Lesson.LessonArray;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int[] array = {7, 10, 5, 0, -4, 33, 8};

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
        System.out.println((char) 27+ "[35mВведите число для поиска: ");

        Scanner scn = new Scanner(System.in);

        int srch = scn.nextInt();
        int x = Arrays.binarySearch(array,srch);

        if (x < 0)
            System.out.println("Данное число отсутствует в массиве");
        else
            System.out.println((char) 27+ "[35mИндекс числа - " + srch + ": " + x);
        }
    }
