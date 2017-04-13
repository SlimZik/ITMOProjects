package homework.lesson11;

import homework.lesson11.inner.Message;
import homework.lesson11.inner.MessageGenerator;
import homework.lesson11.inner.MessagePriority;
import homework.lesson11.inner.User;

import java.util.*;

import static homework.lesson11.inner.MessagePriority.MEDIUM;
import static homework.lesson11.inner.UserGenerator.generate;

/* * Created by xmitya on 20.10.16.*/

public class Tasks2 {
    public static void main(String[] args) {
        MessageGenerator generator = new MessageGenerator();
        List<Message> list1 = generator.generate(10);

        System.out.println("Список сообщений:\n" + list1);
        System.out.println("\nСортировка по важности:");
        sortByPriority(list1, MEDIUM);
                                                                                                                        // Вывод результатов сортировок
        List<User> list2 = generate(10);
        System.out.println("\nСписок пользователей:\n" + list2);
        System.out.println("\nСортировка по кампании и имени:\n" + sortedByCompanyAndName(list2));
        System.out.println("\nСортировка по зарплате и имени:\n" + sortedBySalaryAndName(list2));
        System.out.println("\nСортировка по зарплате, возрасту, кампании и имени:\n" +sortedBySalaryAgeCompanyAndName(list2));

        List<User> list3 = generate(3);
        List<User> list4 = generate(2);

        Iterator<User> iterator = showIterator(list3, list4);

        while (iterator.hasNext()) {                                                                                    // проверка итератора
            User x = iterator.next();
            System.out.println(x);
        }
    }

    private static void sortByPriority(List<Message> messages, MessagePriority priority) {                              // сортировка по приоритету
        messages.sort((o1, o2) -> {
            if (o1.getPriority() == priority && o2.getPriority() == priority)
                return 0;
            else if (o1.getPriority() == priority)
                return -1;
            else if (o2.getPriority() == priority)
                return 1;
            else
                return o1.getPriority().compareTo(o2.getPriority());
        });
        System.out.println(messages);
    }

    private static NavigableSet<User> sortedByCompanyAndName(List<User> users) {
        NavigableSet<User> ns = new TreeSet<>(User.companyAndNameComparator);
        ns.addAll(users);
        return ns;
    }

    private static NavigableSet<User> sortedBySalaryAndName(List<User> users) {
        NavigableSet<User> ns = new TreeSet<>(User.salaryAndNameComparator);
        ns.addAll(users);
        return ns;
    }

    private static NavigableSet<User> sortedBySalaryAgeCompanyAndName(List<User> users) {
        NavigableSet<User> ns = new TreeSet<>(User.salaryAgeCompanyAndNameComparator);
        ns.addAll(users);
        return ns;
    }

    private static <T> Iterator<T> showIterator(Iterable<T> it1, Iterable<T> it2) {
        Iterator<T> Iterator1 = new Iterator<T>() {
            Iterator<T> i1 = it1.iterator();
            Iterator<T> i2 = it2.iterator();

            @Override
            public boolean hasNext() {
                if (i1.hasNext()) return true;

                else if (i2.hasNext()) return true;

                return false;
            }

            @Override
            public T next() {
                if (i1.hasNext())
                    return i1.next();

                else if (i2.hasNext())
                    return i2.next();

                return null;
            }
        };
        return Iterator1;
    }
}
