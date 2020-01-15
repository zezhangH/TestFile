package testreaderandwriter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) {
//        try {
//            FileInputStream inputStream = new FileInputStream("C:tyut.txt");
//            byte[] bytes = new byte[1024];
//            int count = inputStream.read(bytes);
//            while (count != -1) {
//                String s = new String(bytes, 0, count,"GBK");
//                System.out.print(s);
//                count = inputStream.read(bytes);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileReader fileReader = new FileReader("C:tyut.txt");
            char[] chars = new char[1024];
            int count = fileReader.read(chars);
            while (count != -1) {
                String str =new String(chars,0,count);
                System.out.print(str);
                count = fileReader.read(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
