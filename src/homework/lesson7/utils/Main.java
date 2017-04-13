package homework.lesson7.utils;


/* Утилитарный Класс */


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 17);

        List list2 = Arrays.asList("a", "aa", 12, "bfg", 1);

        List list3 = Arrays.asList(1, 11, 12, 44);


        System.out.println("Выводим массив чисел: ");

        System.out.println(list1);

        System.out.println("\n" + list2);

        System.out.println("\n" + list3);


        System.out.println("\n" + "В List1 - нашли: " + Utils.find(list1, o -> (int) o == 6));                             //Нашли наше число

        System.out.println("В List2 - отфильтровали: " + Utils.filter(o -> (o.toString().length() == 1), list2));          //Отфильтровали

        System.out.println("В List3 - трансформировали: " + Utils.transformer(list3, o -> (o.toString() + o.toString()))); //Трансформировали

        System.out.println("\n" + "************************************************************************************");

        System.out.println("Выводим массивы: " + "\n");

// Задание по intersect и difference //

        List list4 = new ArrayList();
        list4.add("Duck");
        list4.add("Cat");
        list4.add("Squirrel");
        list4.add("Shcmetterling");
        System.out.println(list4);

        List list5 = new ArrayList();
        list5.add("Dog");
        list5.add("Goat");
        list5.add("Shcmetterling");
        list5.add("Cat");
        System.out.println(list5 + "\n");

        Predicate2 pred = (o1, o2) -> (o1.equals(o2));
        System.out.println("Пересечения: ");

        for (Object o : Utils.intersect(list4, list5, pred)) {

            System.out.println(o);
        }

        System.out.println("\n" + "Элементы не содержащиеся в List2: ");

        for (Object o : Utils.difference(list4, list5, pred)) {
            System.out.println(o);
        }

// Поиск директории с идентичными файлами и файла с определенным размером //

            System.out.println("\n" + "********************************************************************************");

        Predicate2 pred1 = (o1, o2) -> ((File)o1).getName().equals(((File)o2).getName());

        Predicate pred2 = o -> ((File)o).length() > 30;


            File dir1 = new File("C:\\dir1");
            File dir2 = new File("C:\\dir2");

            List files1 = Utils.toList(dir1.listFiles());
            List files2 = Utils.toList(dir2.listFiles());

            List inters = Utils.intersect(files1, files2, pred1);
            List differ = Utils.difference(files1, files2, pred1);

            System.out.println("Нашли файлы: ");

            for (Object o : inters){
                System.out.println("совпадения: " + o);
            }

            for (Object o : differ){
                System.out.println("различия: " + o);
            }
        System.out.println("Поиск файлов с размером больше 1б: " + Utils.find(files2, pred2));
        }
    }
