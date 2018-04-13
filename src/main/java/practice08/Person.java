package practice08;

public class Person {
    int id;
    String name;
    int age;
    public Person(int id, String name, int age) {
        this.id = id;
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

    public int getId() { return this.id; }

    public boolean equals(Person p) {
         if (this.id == p.getId())
             return true;
         else
             return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person)obj;
            if (this.id == p.getId())
                return true;
            else
                return false;
        }
        else
            return super.equals(obj);
    }
}
