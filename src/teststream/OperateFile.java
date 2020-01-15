package teststream;

import java.io.*;

public class OperateFile {
    public void copyFile(File file, String path) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int read = inputStream.read(bytes);
            File file1 = new File(path + "//" + file.getName());
            outputStream = new FileOutputStream(file1, true);
            while (read != -1) {
                outputStream.write(bytes, 0, read);
                outputStream.flush();
                read = inputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //文件加密
    public void jiaMiFile(File file, String path) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] bytes = new byte[1024];
            int read = inputStream.read(bytes);
            File file1 = new File(path + "//" + file.getName());
            outputStream = new FileOutputStream(file1, true);
            while (read != -1) {
                byte temp = bytes[0];
                bytes[0] = bytes[1];
                bytes[1] = temp;
                outputStream.write(bytes, 0, read);
                outputStream.flush();
                read = inputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //文件夹的复制
    public void superCopyFile(File file, String newpath) {
        String oldFilePath = file.getAbsolutePath();
        String newFilePath = newpath + oldFilePath.split(":")[1];
        //创建一个新的file对象
        File newFile = new File(newFilePath);
        File[] files = file.listFiles();
        if (files != null) {//file文件是一个文件夹 有数组对象
            newFile.mkdir();
            System.out.println(newFile.getName() + "文件夹复制完毕");
            if (files.length != 0) {
                for (File f : files) {
                    this.superCopyFile(f, newpath);
                }
            }
        } else {//file是一个文件 没有子元素不需要数组
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(file);
                fos = new FileOutputStream(newFile);
                byte[] bytes = new byte[1024];
                int count = fis.read(bytes);
                while (count != -1) {
                    fos.write(bytes, 0, count);
                    fos.flush();
                    count = fis.read(bytes);
                }
                System.out.println(newFile.getName() + "文件复制完毕");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fis != null) {
                        fis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if (fos != null) {
                        fos.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public static void main(String[] args) {
        OperateFile operateFile = new OperateFile();
//        operateFile.copyFile(new File("C://tyut.txt"), "D:");
//        operateFile.jiaMiFile(new File("D://Linux命令图.jpg"), "E:");
        operateFile.superCopyFile(new File("D://新建文件夹 (2)"), "C:");
    }
}
