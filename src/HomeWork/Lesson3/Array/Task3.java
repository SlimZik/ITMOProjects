package HomeWork.Lesson3.Array;

/* Task 3)
    Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на
отдельной строке
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Массив из 15 случайных целых чисел из отрезка [0;9]: ");
        int counter = 0;
        int[] arr1 = new int[15];

        for (int i = 0; i < 15; i++) {
            arr1[i] = (int) Math.round(Math.random() * 9);
            System.out.print(arr1[i] + " ");

            if (arr1[i] % 2 == 0)
                counter++;
        }
        System.out.println("\n" + "Количество четных элементов: " + counter);
    }
}
