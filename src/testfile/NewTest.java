package testfile;

import java.io.File;

public class NewTest {
    public void showFile(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length != 0) {
            for (File f : files) {
                this.showFile(f);
            }
        }
        System.out.println(file.getAbsolutePath());
    }

    public static void main(String[] args) {
        NewTest newTest = new NewTest();
        File file = new File("D://");
        newTest.showFile(file);
    }

    public void deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length != 0) {
            for (File f : files) {
                this.deleteFile(f);
            }
        }
        file.delete();
    }
}
