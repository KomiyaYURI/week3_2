package practice08;

public class Student extends Person{
    Klass klass;
    boolean ifLeader=false;

    public Student(int id, String name, int age, Klass klass) {

        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        if (ifLeader)
            return super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        else
            return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
    }

    public void setLeading() {
        ifLeader = true;
    }
}
