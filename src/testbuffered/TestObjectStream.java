package testbuffered;

import java.io.*;

public class TestObjectStream {
    public static void main(String[] args) {
//        try {
//            Person person = new Person("张泽", 18);
//            FileOutputStream fileOutputStream = new FileOutputStream("D://Person.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
//            oos.writeObject(person);
//            oos.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D://Person.txt"));
            Person o = (Person) ois.readObject();
            System.out.println(o.toString());
            o.eat(o.getName());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
