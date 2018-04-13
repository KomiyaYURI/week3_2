package practice02;

public class Student extends Person{
    int Klass;

    public Student(String name, int age,int klass) {

        super(name,age);
        this.Klass = klass;
    }

    public int getKlass() {
        return this.Klass;
    }

    public String introduce() {
        return "I am a Student. I am at Class "+Klass+".";
    }

}
