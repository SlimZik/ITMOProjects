package LessonArray;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Scanner;

public class CryptoProVer2 {

    private static String pad2(String n) {
        if (n.length() < 2) {
            return "0" + n;
        } else {
            return n;
        }
    }

    private static String hex(byte[] bytes) {
        String r = "";
        for (byte aByte : bytes) {
            r = r + pad2(Integer.toHexString(aByte + 128));
        }
        return r;
    }

    private static String safePassword(String unsafe) {
        String safe = unsafe;
        if (safe.length() > 16) {
            safe = safe.substring(0, 16);
        }
        int nn = safe.length();
        for (int i = nn - 1; i < 15; i++) {
            safe = safe + "*";
        }
        return safe;
    }

    private static String encrypt(String value, String password) throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        SecretKey key = new SecretKeySpec(safePassword(password).getBytes("UTF-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding", "SunJCE");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(value.getBytes("UTF-8"));
        return hex(encrypted);
    }

    private static int parseInt2(String s) {
        return (new java.math.BigInteger(s, 16)).intValue();
    }

    private static byte[] fromHex(String enc) {
        byte[] r = new byte[enc.length() / 2];
        for (int i = 0; i < r.length; i++) {
            int n = parseInt2(enc.substring(i * 2, i * 2 + 2)) - 128;
            r[i] = (byte) n;
        }
        return r;
    }

    private static String decrypt(String value, String password) throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException {
        byte[] encypted = fromHex(value);
        SecretKey key = new SecretKeySpec(safePassword(password).getBytes("UTF-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding", "SunJCE");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decrypted = cipher.doFinal(encypted);
        return new String(decrypted, "UTF-8");
    }

    public static void main(String[] args) {
        System.out.println("Сообщение для шифровки: ");
        Scanner scn = new Scanner(System.in);
        String text = scn.nextLine();
        String password = "qwerty";
        try {
            System.out.println("Сообщение: " + text);
            System.out.println("Пароль: " + password);
            String cripted = CryptoProVer2.encrypt(text, password);
            System.out.println("Шифр: " + cripted);
            String decripted = CryptoProVer2.decrypt(cripted, password);
            System.out.println("Дешифровка: " + decripted);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
