package testreaderandwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader(new File("C:tyut1.txt"));
            int code = reader.read();
            while (code != -1) {
//            System.out.println(code);
                System.out.print((char) code);
                code = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
