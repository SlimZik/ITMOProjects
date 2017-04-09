package HomeWork.Lesson3.Array;

/*Task 1)
    Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран
сначала в строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один
элемент от другого началом новой строки). Перед созданием массива подумайте, какого он
будет размера.2 4 6 … 18 20246…20
 */

public class Task1 {
    public static void main(String[] args) {
            int[] arr1 = new int[10];
            int i = 0;
            int b = 2;

            while (i < 10) {
                arr1[i] = b;
                b += 2;
                i++;
            }
            for (i = 0; i < 10; i++) //выводим в строку
                System.out.print(arr1[i] + " ");

            System.out.println();
            for (i = 0; i < 10; i++)//Выводим в столбик
                System.out.println(arr1[i]);
    }
}
