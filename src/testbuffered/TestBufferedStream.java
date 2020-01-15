package testbuffered;

import java.io.*;

public class TestBufferedStream {
    public static void main(String[] args) {
        try {
            File file = new File("C://tyut1.txt");
            FileInputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            int read = bufferedInputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
