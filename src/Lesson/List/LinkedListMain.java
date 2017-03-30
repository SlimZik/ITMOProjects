package Lesson.List;

/*  */

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        for (Object o : list){

            System.out.println(o);
        }

    }
}