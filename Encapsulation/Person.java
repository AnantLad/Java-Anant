package Encapsulation;
public class Person {

    private String name;

    private int age;

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }
}

 class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setname("Anant");
        person.setage(20);
        System.out.println("Name: " + person.getname());
        System.out.println("age: " + person.getage());
    }
}