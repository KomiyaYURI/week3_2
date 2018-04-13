package practice08;

public class Klass {
    int klass;
    Student leader=null;

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
        leader = student;
        leader.setLeading();
    }

    public Student getLeader() {
        return leader;
    }
}
