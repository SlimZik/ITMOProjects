package HomeWork.Array;

/* Task4)
    Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран
в строку. Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на
экран на отдельной строке */

public class Task4 {
    public static void main(String[] args) {
        int [] arr1 = new int[8];
        for (int i = 0; i < 8; i++) {
            arr1[i] = (int) Math.round(Math.random() * 9 + 1);
            System.out.print(arr1[i] + " ");
        }
        System.out.println("Вывод массива на экран");
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0)
                arr1[i] = 0;
            System.out.print(arr1[i] + " ");
        }
        System.out.println("Каждый элемент с нечётным индексом заменили на ноль");
    }
}
