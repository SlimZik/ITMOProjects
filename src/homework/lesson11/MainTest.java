package homework.lesson11;

import java.util.ArrayList;
import java.util.List;

/*Created by xmitya on 19.10.16.*/



public class MainTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(new Object());
        }

        list.removeAll(list);
    }
}
