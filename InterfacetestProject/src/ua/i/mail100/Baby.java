package ua.i.mail100;

public class Baby {

    private String name;

    public Baby(String name) {
        this.name = name;
    }

    public void playWith(Play withWho) {
        System.out.println(withWho.playString());
    }

}
