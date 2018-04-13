package practice11;

import java.util.Iterator;
import java.util.Set;

public class Teacher extends Person{
    Set<Klass> klasses=null;

    public Teacher(int id, String name, int age) {

        super(id, name , age);
    }

    public Teacher(int id, String name, int age, Set<Klass> klasses) {

        super(id, name , age);
        this.klasses = klasses;
        for (Klass klass : klasses) { klass.addTeacher(this); }
    }

    public Set<Klass> getClasses() {
        return this.klasses;
    }

    public String introduce() {

        if (klasses != null) {
            String responseStr = super.introduce() + " I am a Teacher. I teach Class ";
            Iterator<Klass> klass_it = klasses.iterator();
            while (true) {
                responseStr += klass_it.next().getNumber();
                if (klass_it.hasNext()) {
                    responseStr += ", ";
                }
                else {
                    responseStr += ".";
                    break;
                }
            }
            return responseStr;
        }
        else
            return super.introduce() + " I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student)
    {
        if (klasses.contains(student.getKlass()))
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        else
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        if (klasses.contains(student.getKlass()))
            return true;
        else
            return false;
    }
}
