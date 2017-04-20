package homework.lesson4.linkedlist;

/*  */

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        for (Integer o : list){

            //list.remove(9); //  выбросит Concurrent Modification Exception

            System.out.println(o);
        }

    }
}