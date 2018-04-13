package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int klass;
    Student leader=null;
    List<Student> students = new ArrayList();

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber()
    {
        return klass;
    }

    public String getDisplayName() {
        return "Class " + klass;
    }

    public void assignLeader(Student student) {
        if (students.contains(student)) {
            leader = student;
            leader.setLeading();
        }
        else
            System.out.print("It is not one of us.\n");
    }
    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        students.add(student);
    }
}
