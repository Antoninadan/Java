package uaimail100;

public class ClonableClass implements Cloneable {
    int a;
    String s;

    public ClonableClass(int a, String s) {
        this.a = a;
        this.s = s;
    }

    @Override
    public String toString() {
        return "ClonableClass{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }

    @Override
    protected ClonableClass clone() throws CloneNotSupportedException {

        try {
            return (ClonableClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


}
