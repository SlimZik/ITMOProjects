package homework.lesson14;

/* Чтение файла */

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {

        try (FileInputStream in1 = new FileInputStream("C:\\Users\\SLimZik\\Documents\\ITMO\\dir\\file1.txt"))    // Указали путь для чтения файла
        {
            System.out.println("Размер файла : " + in1.available() + " байт(а)");                                       // Вывод в консоль

            int i;
            while ((i = in1.read()) != -1)                                                                              // Проверка
                System.out.print((char) i);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\nСчитываем данные в массив байтов: ");


        try (FileInputStream in2 = new FileInputStream("C:\\Users\\SLimZik\\Documents\\ITMO\\dir\\bufferFile.txt"))// Считываем в массив байтов
        {
            byte[] buffer = new byte[in2.available()];                                                                  // Создали байтовый массив

            in2.read(buffer, 0, in2.available());                                                                   // Считываем файл в буфер

            System.out.println("Содержимое файла: ");
            for (byte aBuffer : buffer) {
                System.out.print((char) aBuffer);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("\n");
    }
}
