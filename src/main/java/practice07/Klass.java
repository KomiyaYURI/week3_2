package practice07;

public class Klass {
    int klass;

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
}