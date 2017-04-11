package HomeWork.Lesson11;

import HomeWork.Lesson11.inner.Message;
import HomeWork.Lesson11.inner.MessagePriority;
import HomeWork.Lesson11.inner.User;

import java.util.*;

import static HomeWork.Lesson11.inner.UserGenerator.generate;

/* * Created by xmitya on 20.10.16.*/

public class Tasks2 {
    public static void main(String[] args) {
        System.out.println(generate(10));
    }

    private static void sortByPriority(List<Message> messages, MessagePriority priority) {

    }

    private static NavigableSet<User> sortedByCompanyAndName(List<User> users) {


        return Collections.emptyNavigableSet();
    }

    private static NavigableSet<User> sortedBySalaryAndName(List<User> users) {

        return Collections.emptyNavigableSet();
    }

    private static NavigableSet<User> sortedBySalaryAgeCompanyAndName(List<User> users) {

        return Collections.emptyNavigableSet();
    }

    private static <T> Iterator<T> viewIterator(Iterable<T> it1, Iterable<T> it2) {

        return null;
    }


}
