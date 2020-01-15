package testbuffered;

import java.io.*;

public class TestBufferedReaderAndWriter {
    public String login(String username, String password) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D://User.txt"));
            String user = br.readLine();
            while (user != null) {
                String[] value = user.split("-");
                if (value[0].equals(username)) {
                    if (value[1].equals(password)) {
                        return "登录成功";
                    }
                    break;
                }
                user = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "帐号或密码错误";
    }

    public static void main(String[] args) {
//        File file = new File("C://tyut1.txt");
//        try {
//            FileReader reader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            int code = bufferedReader.read();
//            while (code != -1) {
//                System.out.print((char) code);
//                code = bufferedReader.read();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            FileReader fileReader = new FileReader("C://tyut1.txt");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = bufferedReader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        TestBufferedReaderAndWriter testBufferedReaderAndWriter = new TestBufferedReaderAndWriter();
        String result = testBufferedReaderAndWriter.login("渡一教育", "666");
        System.out.println(result);
    }
}
