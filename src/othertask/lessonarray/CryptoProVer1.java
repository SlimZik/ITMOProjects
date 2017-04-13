package othertask.lessonarray;

/* ещё работа с ^ XOR */
public class CryptoProVer1 {
    public static void main(String[] args) {
        String text = "После прочтения сжечь";

        byte key = 50;

        byte[] bytes = text.getBytes();

        crypt(bytes, key);

        System.out.println("Зашифрованное сообщение - " + new String(bytes));

        crypt(bytes, key);

        System.out.println("Дешифровка - " + new String(bytes));
    }

    private static void crypt(byte[] bytes, byte key) {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] ^= key;
        }
    }
}
