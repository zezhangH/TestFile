package teststream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestInputStream {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D://tyut.txt");
            byte[] b = new byte[6];
            int count = inputStream.read(b);
            while (count != -1) {
                String value = new String(b, 0, count);
                System.out.print(value);
                count = inputStream.read(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //利用单字节输入流访问文件
//        File file = new File("D://tyut.txt");
//        try {
//            FileInputStream inputStream = new FileInputStream(file);
//            try {
//                int read = inputStream.read();
//                while (read >0) {
//                    System.out.print((char) read);
//                    read=inputStream.read();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
