package homework.lesson4.old;

/* Тест  linkedlist*/


public class Test {
    public static void main(String[] args) {
        LinkedList ml = new LinkedList();       // Ссылка
        ml.addF("Да");                     // Элементы добавляющиеся в конец либо в начало списка
        ml.addB("это");
        ml.addB("связный");
        ml.addB("список");

        ml.printingList();                     // Печать списка
        System.out.println();

        ml.remove("Да");
        ml.remove("это");
        ml.addF("Нет, это же");



        ml.printingList();
        System.out.println();                  // Вывод на экран
    }
}
