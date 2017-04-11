package HomeWork.Lesson11;

import HomeWork.Lesson11.inner.Message;
import HomeWork.Lesson11.inner.MessageGenerator;
import HomeWork.Lesson11.inner.MessagePriority;

import java.util.*;

/* Created by xmitya on 17.10.1 */

public class Tasks1 {

    public static void main(String[] args) {
        MessageGenerator generator = new MessageGenerator();

        List<Message> messages = generator.generate(100);

        countEachPriority(messages);
        countCountEachCode(messages);
        countUniqueMessages(messages);

        System.out.println("Сообщения в естественном порядке: \n" + genuineMessagesInOriginalOrder(messages));
        System.out.println("-----------------------------------------------------------------------------------------");

        removeEach(generator.generate(100), MessagePriority.LOW);
        removeOther(generator.generate(100), MessagePriority.URGENT);
    }

    private static void countEachPriority(List<Message> messages) {
        // Сосчитайте количество сообщений для каждого приоритета.
        // Ответ необходимо вывести в консоль.

        // TODO implement
        int[] countPriority = new int[MessagePriority.values().length];
        for (Message m : messages) {
            countPriority[m.getPriority().ordinal()]++;
        }
        for (int i = 0; i < countPriority.length; i++) {
            System.out.println(MessagePriority.fromOrdinal(i) + ": " + countPriority[i]);
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    private static void countCountEachCode(List<Message> messages) {
        // Сосчитайте количество сообщений для каждого кода сообщения.
        // Ответ необходимо вывести в консоль.

        // TODO implement
        List<Integer> countCode = new ArrayList<>(10);
        for (Message m : messages) {
            if (countCode.size() <= m.getCode()) {
                for (int i = countCode.size(); i < m.getCode() + 1; i++) {
                    countCode.add( 0);
                }
            }
            countCode.set(m.getCode(), countCode.get(m.getCode()) + 1);
        }
        for (int i = 0; i < countCode.size(); i++) {
            System.out.println(i + ": " + countCode.get(i));
        }
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    private static void countUniqueMessages(List<Message> messages) {
        // Сосчитайте количество уникальных сообщений.
        // Ответ необходимо вывести в консоль.

        // TODO implement
        Set<Message> uniqueMessages = new HashSet<>();
        uniqueMessages.addAll(messages);
        System.out.println("Уникальных сообщений: " + uniqueMessages.size());
        System.out.println("-----------------------------------------------------------------------------------------");
    }

    private static List<Message> genuineMessagesInOriginalOrder(List<Message> messages) {
        // Здесь необходимо вернуть только неповторяющиеся сообщения и в том порядке, в котором
        // они встречаются в первоначальном списке. Например, мы на входе имеем такие сообщения:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}],
        // то на выходе должны получить:
        // [{URGENT, 4}, {HIGH, 9}, {LOW, 3}].
        // Т.е. остались только уникальные значения, и порядок их поступления сохранен.

        // TODO implement
        List<Message> OriginalMessages = new ArrayList<>();
        for (Message m : messages) {
            if (!OriginalMessages.contains(m))
                OriginalMessages.add(m);
        }
        System.out.println("Уникальные сообщения: " + OriginalMessages);
        System.out.println("-----------------------------------------------------------------------------------------");

        return OriginalMessages;
    }

    private static void removeEach(Collection<Message> messages, MessagePriority priority) {

        System.out.printf("До удаления сообщений с приоритетом: %s, %s\n", priority, messages);

        // TODO implement
        messages.removeIf(message -> message.getPriority() == priority);  // Удаляем из коллекции каждое сооющение с заданным приоритетом (см. выше).

        System.out.printf("После удаления сообщений с приоритетом: %s, %s\n", priority, messages);
    }

    private static void removeOther(Collection<Message> messages, MessagePriority priority) {

        System.out.printf("До удаления сообщений без приоритета: %s, %s\n", priority, messages);

        // TODO implement
        messages.removeIf(message -> message.getPriority() != priority); // Удаляем из коллекции все сообщения, кроме тех, которые имеют заданный приоритет (см. выше).

        System.out.printf("После удаления сообщений без приоритета: %s, %s\n", priority, messages);
    }
}
