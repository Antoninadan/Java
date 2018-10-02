package ua.i.mail100;

public interface Play {
    // переменные неявно final static

    public String playString();     // how to play

    default void sum(int a, int b) {
        System.out.println(a + " + "+ b + " = " + (a+b));
    }

    static void printHello() {
        System.out.println("Hello");
    }
}
