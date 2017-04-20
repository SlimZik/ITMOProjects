package homework.lesson14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* Шифрование XOR'ом */

public class CryptXor {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/SLimZik/Documents/ITMO/dir/file1.txt");                                 // Путь к файлу для шифровки
        encryptFile(file, "crypt","C:/Users/SLimZik/Documents/ITMO/dir/cryptfile1.txt");                       // Путь к уже зашифрованному файлу

        File file2 = new File("C:/Users/SLimZik/Documents/ITMO/dir/cryptfile1.txt");                           // Путь к уже зашифрованному файлу
        encryptFile(file2, "crypt", "C:/Users/SLimZik/Documents/ITMO/dir/decodefile1.txt");                    // Путь к расшифрованному файлу
    }


    public static void encryptFile (File file, String key, String path) throws IOException {                            // Реализация шифрования файла
        try (FileInputStream in = new FileInputStream(file);
             FileOutputStream out = new FileOutputStream(path)) {

            byte[] keys = key.getBytes();                                                                               // Байтовый массив ключ

            byte[] buffer = new byte[128];                                                                              // Байтовый массив

            int x;
            while ((x = in.read(buffer)) > 0)
                out.write(crypt(buffer, keys), 0, x);
        }
    }

    private static byte[] crypt(byte[] txt, byte[] key) {
        for (int i = 0; i < txt.length; i++) {
            txt[i] ^= key[i % key.length];
        }
        return txt;
    }
}