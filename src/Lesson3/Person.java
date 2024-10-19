package Lesson3;

import java.io.*;

//Задание 1: Создайте класс Person с полями name и age. Реализуйте сериализацию и десериализацию этого класса в файл.
public class Person implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person=new Person("Ivan",42,12345);
        FileOutputStream fileOutputStream=new FileOutputStream("personData.bin");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        System.out.println("Объект сериализован");

        FileInputStream fileInputStream=new FileInputStream("personData.bin");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Person person2= (Person) objectInputStream.readObject();
        System.out.println("Объект десериализован");
        System.out.println(person2.getName()+"    "+person2.getAge());
    }
    private String name;
    private int age;
    private transient int password; // помечаем поле которое не сериализуем

    public Person(String name, int age,int password) {
        this.name = name;
        this.age = age;
        this.password=password;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
