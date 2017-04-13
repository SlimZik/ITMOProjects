package homework.lesson11.Intersect;

/* Лучше не пересекаться  */

import java.util.LinkedHashSet;
import java.util.Set;

public class Intersect {
    public static void main(String[] args) {
        Set<String> set1 = new LinkedHashSet<>();
        set1.add("Fallout2");
        set1.add("Morrowind");
        set1.add("Diablo3");
        set1.add("CS:GO");

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("CS:GO");
        set2.add("NFS");
        set2.add("Fallout2");
        set2.add("Skyrim");

        set2.retainAll(set1);        //удаляем из второго HashSet все пересечения с первым HashSet и оставляем и получаем разницу

        System.out.println("Наш old scool: " + set2);
    }
}
