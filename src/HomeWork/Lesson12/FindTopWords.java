package HomeWork.Lesson12;

/* Вывести на экран топ 100 и топ 10 слов из книги */


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class FindTopWords {
    public static void main(String[] args) throws IOException {

        File text = new File("C:/Users/SLimZik/Documents/ITMO/wp/wp.txt");

        // Вычитываем все строки из файла
        List<String> lines = Files.readAllLines(text.toPath());

        // Создаем пустую коллекцию для слов.
        List<String> words = new ArrayList<>();

        for (String line : lines) {
            // Для каждой строки
            String[] wordSplit =
                    line.toLowerCase() // Переводим в нижний регистр
                            .replaceAll("\\p{Punct}", " ") // Заменяем все знаки на пробел
                            .trim() // Убираем пробелы в начале и конце строки.
                            .split("\\s"); // Разбиваем строки на слова

            for (String s : wordSplit) {
                // Выбираем только непустые слова.
                if (s.length() > 0)
                    words.add(s.trim());
            }
        }
        System.out.println("Всего слов: " + words.size());

        Map<String, Integer> top = new TreeMap<>();
        for (String s : words){
            Integer cnt = top.get(s);

            if (cnt == null) cnt = 0;

            top.put(s, ++cnt);
        }
        ArrayList<Map.Entry<String, Integer>> topWords = new ArrayList<>(top.entrySet());

        topWords.sort((o1, o2) -> -Integer.compare(o1.getValue(), o2.getValue()));

        System.out.println("\nТоп 10 слов: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(topWords.get(i));
        }
    }
}
