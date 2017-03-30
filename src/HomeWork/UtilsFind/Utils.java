package HomeWork.UtilsFind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* **************************************************************************************************************** */
public class Utils {
    static Object find(List list, Predicate pred) {

        for (Object o : list) {
            if (pred.apply(o)) {
                return o;
            }
        }
        return null;
    }
    static List filter(Predicate pred, List list) {
        List list2 = new ArrayList();

        for (Object o : list) {
            if (pred.apply(o)) {
                list2.add(o);
            }
        }
        return list2;
    }
    static List transformer(List list, Transformer trans) {
        List list2 = new ArrayList();

        for (Object o : list) {
            list2.add(trans.trans(o));
        }
        return list2;
    }
    public static List toList(Object[] arr) {                                  /* Из массива в лист */
        List list = new ArrayList();
        Collections.addAll(list, arr);
        return list;
    }
    static List intersect(List list1, List list2, Predicate2 pred) {    /* Возврат значений пересечения двух листов */
        List List = new ArrayList();

        for(Object o : list1) {
            for (Object aList2 : list2) {
                if (pred.apply(o, aList2)) List.add(o);
            }
        }
        return List;
    }
    static List difference(List list1, List list2, Predicate2 pred) {   /* Возврат списка, который содержит
                                                                                все элементы из list1, за исключением тех,
                                                                                которые есть в нашем list2 */
        List listx = new ArrayList();

        listx.addAll(list1);

        for (Object aList1 : list1) {
            for (Object aList2 : list2) {
                if (pred.apply(aList1, aList2)) listx.remove(aList1);
            }
        }
        return listx;
    }
}