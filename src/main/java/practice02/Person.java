package practice02;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old.";
    }

    public String getName () {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
