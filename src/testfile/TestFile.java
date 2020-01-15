package testfile;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
//        String path = "D://tyut.txt";
//        File file = new File(path);
//        System.out.println(file.canExecute());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        long length = file.length();
//        System.out.println(length);
//        File file = new File("D://abc.txt");
//        try {
//            boolean value = file.createNewFile();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        File file = new File("D://aaa//test");
//        boolean mkdir = file.mkdir();
        file.mkdirs();
    }

}
