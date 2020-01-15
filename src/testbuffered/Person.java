package testbuffered;

import java.io.Serializable;

public class Person implements Serializable {
    private long serialVersionUID = -574773677111604321L;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void eat(String name) {
        System.out.println(name + "吃饭的方法");
    }

    @Override
    public String toString() {
        return this.name + "," + this.age;
    }
}
