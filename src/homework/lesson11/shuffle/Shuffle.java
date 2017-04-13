package homework.lesson11.shuffle;

/* Перемешиваем лист или shuffle машина для казино Беладжио */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // Наш лист с дженериком
        for (int i = 0; i < 10; i++) {          // Проверка
            list.add(i);
        }

        System.out.println("Стандартный порядок: " + list);               // Вывод листа
        System.out.println("Мешанина: " + shuffle(list));                 // Вывод результатов мешанины
    }

    public static List<Integer> shuffle(List<Integer> list) {     // Статический класс shuffle
        Random rnd = new Random();

        for (int i = 0; i < list.size(); i++) {                   // Проверка
            int index = rnd.nextInt(list.size());

            int tmp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, tmp);
        }
        return list;
    }
}
