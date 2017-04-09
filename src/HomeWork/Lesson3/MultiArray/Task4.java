package HomeWork.Lesson3.MultiArray;

/* Task 4)
    Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел
из отрезка [0;9]. Вывести массив на экран. Преобразовать массив таким образом, чтобы на
первом месте в каждой строке стоял её наибольший элемент. При этом изменять состав
массива нельзя, а можно только переставлять элементы в рамках одной строки. Порядок
остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а
можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на
экран.
 */

public class Task4 {
    public static void main(String[] args) {
        int[][] arr2d = new int[6][7];

        for (int i = 0; i < arr2d.length; i++) {
            int max = 0; //максимальный элемент
            int index = 0; //индекс максимального элемента

            for (int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = (int)(Math.random() * 10);
                System.out.print(arr2d[i][j] + " ");

                if (j == 0) max = arr2d[i][j]; //присваиваем начальное значение для max
                else {
                    if (max < arr2d[i][j]) { //меняем max и index, если нашли больший элемент
                        max = arr2d[i][j];
                        index = j;
                    }
                }

                if (j == arr2d[i].length - 1 && arr2d[i][0] != arr2d[i][index]) { //если дошли до конца и первый элемент не совпадает с максимальным
                    int tmp = arr2d[i][0];
                    arr2d[i][0] = arr2d[i][index];
                    arr2d[i][index] = tmp;
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int[] anArr2d : arr2d) {
            for (int anAnArr2d : anArr2d) {
                System.out.print(anAnArr2d + " ");
            }
            System.out.println();
        }
    }
}
