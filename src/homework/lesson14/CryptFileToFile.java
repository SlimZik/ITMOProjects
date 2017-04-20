package homework.lesson14;

import java.io.*;

/* Шифровка файлом */


public class CryptFileToFile {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\SLimZik\\Documents\\ITMO\\dir\\TestFile.txt");                        // Путь к фалам 1 и 2
        File file2 = new File("C:\\Users\\SLimZik\\Documents\\ITMO\\dir\\crypt\\ttx.jpg");

        CryptFile(file1, file2, "C:\\Users\\SLimZik\\Documents\\ITMO\\dir\\crypt\\cryptTestFile");                  // Путь сброса шифрованного файла

        File file3 = new File("C:\\Users\\SLimZik\\Documents\\ITMO\\dir\\crypt\\cryptTestFile");

        CryptFile(file3, file2, "C:\\Users\\SLimZik\\Documents\\ITMO\\dir\\crypt\\decodeTestFile.txt");             // Путь сброса расшифрованного файла
    }

    private static void CryptFile(File file, File key, String path) throws IOException {
        try (InputStream in1 = new FileInputStream(file);
             InputStream in2 = new FileInputStream(key);
             OutputStream fout = new FileOutputStream(path)) {

            byte[] buffer = new byte[1024];
            byte[] bkey = new byte[32];

            in2.read(bkey);

            int len;
            while ((len = in1.read(buffer)) > 0) {
                fout.write(crypt(buffer, bkey));
            }
        }
    }

    private static byte[] crypt(byte[] bfile, byte[] bkey) {
        for (int i = 0; i < bfile.length; i++) {
            bfile[i] ^= bkey[i % bkey.length];
        }
        return bfile;
    }
}
