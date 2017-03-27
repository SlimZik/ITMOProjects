package Lesson.List;

/*  */

public class LMain {
    public static void main(String[] args) {
        LList list = new LList();

        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        for (Object o : list){

            System.out.println(o);
        }

    }
}