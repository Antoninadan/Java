package ua.i.mail100;

public class Dog implements Play {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String playString() {
        return "I play with dog";
    }

}
