package homework.lesson14;

/* Разделяй и склеивай */

import java.io.*;

public class SplitAndPaste {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/SLimZik/Documents/ITMO/dir/8408_midas.zip");                            // Путь к файлу который будем разделять
        split(file, "C:/Users/SLimZik/Documents/ITMO/dir/8408_midas.zip");                                   // Метод разделениия путь к файлу
        paste("C:/Users/SLimZik/Documents/ITMO/dir/8408_midas.zip1",
                 "C:/Users/SLimZik/Documents/ITMO/dir/8408_midas.zipnew", 7);                           // Метод склеивания путь к файлу
    }                                                                                                                   // и размер куска


    public static int split(File file, String pathToResult) throws IOException {                                        // Метод который разделяет файл на части
        try (InputStream in = new FileInputStream(file)) {

            byte[] buffer = new byte[1024];                                                                             // Массив байтов с указанием размер одной части

            int x;
            int i = 1;
            while ((x = in.read(buffer)) > 0) {                                                                         // Проверка
                try (OutputStream out = new FileOutputStream(pathToResult + i)) {
                    out.write(buffer, 0, x);
                }
                i++;
            }
            return i;
        }
    }
    public static void paste(String pathToFirstPart, String pathToResult, int parts) throws IOException {               // Метод который склеивает файлы
        try (OutputStream out = new FileOutputStream(pathToResult)) {

            byte[] buffer = new byte[1024];

            int lenght;

            for (int i = 1; i <= parts; i++) {
                try (InputStream fin = new FileInputStream(pathToFirstPart + i)) {
                    while ((lenght = fin.read(buffer)) > 0) {
                        out.write(buffer, 0, lenght);
                    }
                }
            }
        }
    }
}
