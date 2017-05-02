package homework.lesson17.decorator;

import java.io.*;



public class CryptoOutputStream extends FilterOutputStream {
    private byte[] key;

    private int idx;

    public CryptoOutputStream(OutputStream out, byte[] key) {
        this(out, key, 0);
    }

    public CryptoOutputStream(OutputStream out, byte[] key, long off) {
        super(out);

        this.key = key.clone();

        idx = (int) (off % key.length);
    }

    @Override
    public void write(int b) throws IOException {
        byte b1 = (byte) b;

        b1 ^= key[idx++];

        idx %= key.length;

        out.write(b1);
    }
}
