package practice06;

public class Teacher extends Person{
    int Klass=-1;

    public Teacher(String name, int age) {

        super(name , age);
    }

    public Teacher(String name, int age, int klass) {

        super(name , age);
        this.Klass = klass;
    }

    public int getKlass() {
        return this.Klass;
    }

    public String introduce() {

        if (Klass > 0)
            return super.introduce() + " I am a Teacher. I teach Class " + Klass + ".";
        else
            return super.introduce() + " I am a Teacher. I teach No Class.";
    }
}
