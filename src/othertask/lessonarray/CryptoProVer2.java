package othertask.lessonarray;

import java.util.Scanner;

public class CryptoProVer2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите сообщение: ");

        String secretText = in.nextLine();                                                                              // текст который нужно зашифровать

        System.out.println("Введите ключ: ");

        String secretKey = in.nextLine();                                                                               // наш ключ / пароль


        byte[] text = secretText.getBytes();                                                                            // Создаем байтовый массив с тестом
        byte[] key = secretKey.getBytes();                                                                              // Создаем байтовый массив с ключом

        System.out.println("Ваше сообщение: " + new String(text));                                                      // Вывод на экран
        Thread.sleep(5000);
        crypt(text, key);
        System.out.println("Шифровка: " + new String(text));
        Thread.sleep(5000);
        crypt(text, key);
        System.out.println("\nДекодировка шифра: " + new String(text));
    }

    public static void crypt(byte[] txt, byte[] key) {                                                                  // Шифрование
        for (int i = 0; i < txt.length; i++) {
            txt[i] ^= key[i % key.length];
        }
    }
}