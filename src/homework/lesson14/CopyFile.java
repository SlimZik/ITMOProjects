package homework.lesson14;

/* Копируем файл */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
                                                                                                                        // Переделал с реализацией InputStream
public class CopyFile {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/SLimZik/Documents/ITMO/dir/file1.txt");
        copyFile(file, "C:/Users/SLimZik/Documents/ITMO/dir/file2.txt");
    }

    public static void copyFile (File file, String path) throws IOException {
        try (FileInputStream file1 = new FileInputStream(file);
             FileOutputStream file2 = new FileOutputStream(path)) {

            byte[] buffer = new byte[128];

            int len;
            while ((len = file1.read(buffer)) > 0)
                file2.write(buffer, 0, len);
        }
    }
}