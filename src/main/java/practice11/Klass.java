package practice11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Klass {
    int klass;
    Student leader=null;
    List<Student> students = new ArrayList();
    Set<Teacher> teacheres = new HashSet<Teacher>();

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

            for (Teacher teacher : teacheres) {
                String printStr = "I am " + teacher.getName() + ". I know " + student.getName() +  " become Leader of Class " + klass + ".\n";
                System.out.print(printStr);
            }
        }
        else
            System.out.print("It is not one of us.\n");
    }
    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        students.add(student);
        for (Teacher teacher : teacheres) {
            String printStr = "I am " + teacher.getName() + ". I know " + student.getName() +  " has joined Class " + klass + ".\n";
            System.out.print(printStr);
        }
    }

    public void addTeacher(Teacher teacher) {
        teacheres.add(teacher);
    }
}
