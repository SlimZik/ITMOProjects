package HomeWork.LinkedList;

/* Тест  LinkedList*/


public class Test {
    public static void main(String[] args) {
        LinkedList ml = new LinkedList();      // Ссылка
        ml.addB(10);                       // Элементы добавляющиеся в конец либо в начало списка
        ml.addB(11);
        ml.addB(12);
        ml.addF(15);

        ml.printingList();                     // Печать списка
        System.out.println();

        ml.remove(6);
        ml.remove(5);
        ml.remove(12);


        ml.printingList();
        System.out.println();                  // Вывод на экран
    }
}
