package practice09;

public class Teacher extends Person{
    Klass klass=null;

    public Teacher(int id, String name, int age) {

        super(id, name , age);
    }

    public Teacher(int id, String name, int age, Klass klass) {

        super(id, name , age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {

        if (klass != null)
            return super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
        else
            return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student)
    {
        if (klass == student.getKlass())
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        else
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }
}
