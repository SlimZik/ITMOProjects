package HomeWork.Lesson4.LinkedList;

/*  */

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        for (Integer o : list){

            System.out.println(o);
        }

    }
}