package homework.lesson12;

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
        for (String s : words) {
            Integer cnt = top.get(s);

            if (cnt == null) cnt = 0;

            top.put(s, ++cnt);
        }
        ArrayList<Map.Entry<String, Integer>> topWords = new ArrayList<>(top.entrySet());                               // Сортировка и проверка
        topWords.sort((o1, o2) -> -Integer.compare(o1.getValue(), o2.getValue()));

        System.out.println("\nТоп 10 слов: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(topWords.get(i));
        }
        topLetters(words);
        topPhrases(words);
        groupWords(words);
    }

    public static void topLetters(List<String> words) {                                                                 // Количество букв
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Map<Character, Double> letters = new TreeMap<>();
        for (Character ch : alphabet) {
            letters.put(ch, 0.0);
        }

        int lettersCount = 0;

        for (String word : words) {
            char[] charWord = word.toCharArray();
            for (Character ch : charWord) {
                Double count = letters.get(ch);

                if (count == null) continue;

                letters.put(ch, ++count);
                lettersCount++;
            }
        }

        System.out.println("\n Количество букв в книге: " + lettersCount);

        for (Map.Entry<Character, Double> pair : letters.entrySet()) {
            Double count = pair.getValue();
            pair.setValue(count / lettersCount * 100);
        }

        List<Map.Entry<Character, Double>> topLetters = new ArrayList<>(letters.entrySet());                            // Сортировка и проверка
        topLetters.sort((o1, o2) -> -Double.compare(o1.getValue(), o2.getValue()));

        System.out.println("\n Топ 10 букв: ");
        for (int j = 0; j < 10; j++) {
            System.out.println(topLetters.get(j));
        }
    }

    public static void topPhrases(List<String> words) {                                                                 //топ фраз в книге
        ArrayList<String> tmp = new ArrayList<>(words);
        Map<String, Integer> phrases = new TreeMap<>();

        for (int i = 0; i < tmp.size() - 1; i++) {
            String phrase = tmp.get(i) + " " + tmp.get(i + 1);
            Integer count = phrases.get(phrase);

            if (count == null) count = 0;

            phrases.put(phrase, ++count);
        }

        List<Map.Entry<String, Integer>> topPhrases = new ArrayList<>(phrases.entrySet());                              // Сортировка и проверка
        topPhrases.sort((o1, o2) -> -Integer.compare(o1.getValue(), o2.getValue()));

        System.out.println("\n Топ 10 фраз:");
        for (int i = 0; i < 10; i++) {
            System.out.println(topPhrases.get(i));
        }
    }

    public static void groupWords(List<String> words) {                                                                 // Группировка слов по длине
        Map<Integer, Set<String>> wordsLength = new TreeMap<>();
        for (String s : words) {
            Set<String> set = wordsLength.get(s.length());

            if (set == null)
                set = new TreeSet<>();

            set.add(s);

            wordsLength.put(s.length(), set);
        }

        List<Map.Entry<Integer, Set<String>>> topLength = new ArrayList<>(wordsLength.entrySet());                      // Сортировка и проверка
        topLength.sort((o1, o2) -> -Integer.compare(o1.getKey(), o2.getKey()));

        System.out.println("\n Группировка слов по их длине:");
        for (Map.Entry<Integer, Set<String>> aTopLength : topLength) {
            System.out.println(aTopLength);
        }
    }
}
