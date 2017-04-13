package othertask;


public class FormInfo {
    public static void main(String[] args) {
        Form x = new Form("Сотрудник", "Вакульский Р.В.", 2006);

        x.info();

        Form x2 = new Form();
        x2.info();
    }
}
