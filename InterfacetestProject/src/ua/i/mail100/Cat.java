package ua.i.mail100;

public class Cat implements Play {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String playString() {
        return "I play with cat";
    }

}
