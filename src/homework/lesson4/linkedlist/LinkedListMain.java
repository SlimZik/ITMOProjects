package homework.lesson4.linkedlist;

/*  */

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        for (Integer o : list){

            //list.add(10); //  выбросит Exception

            System.out.println(o);
        }

    }
}