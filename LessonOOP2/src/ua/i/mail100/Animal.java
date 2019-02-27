package ua.i.mail100;

public class Animal {
    private int age;
    public double weigt;
    public boolean sex;
    public String ration;

    public Animal(int age, double weigt, boolean sex, String ration) {
        super();
        this.age = age;
        this.weigt = weigt;
        this.sex = sex;
        this.ration = ration;
    }

    public Animal() {
        super();
    }

    public void getVoice() {
    }

    public String toString() {
        return " age=" + age + ", weigt=" + weigt + ", sex=" + sex + ", ration=" +
                ration + "]";
    }
}
