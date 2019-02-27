package ua.i.mail100;

public class Cat  extends Animal {
    public String name;
    public String type;
    public boolean sex; // test the same name parameter

    public Cat(int age, double weigt, boolean sex, String ration, String name, String type, boolean sex1) {
        super(age, weigt, sex, ration);
        this.name = name;
        this.type = type;
        this.sex = sex1;
    }

    @Override
    public void getVoice() {
        System.out.println("May - May");
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", type=" + type + super.toString();
    }

    public void showSex() {
        System.out.println("sex from superclass: " + super.sex);
        System.out.println("sex from subclass: " + sex);
    }

}