package homework.lesson14;

import java.io.FileOutputStream;
import java.io.IOException;

/* Запись в файл */
public class WriteFile {
    public static void main(String[] args) {
        String text = "Keep Claim and press Ctrl+Alt+Delete";

        try (FileOutputStream out = new FileOutputStream("C:\\Users\\SLimZik\\Documents\\ITMO\\dir\\TestFile.txt")) // Запись
        {

            byte[] bufer = text.getBytes();                                                                               //перевод строки в байты

            out.write(bufer, 0, bufer.length);
            System.out.println("Запись выполнена успешно!");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
