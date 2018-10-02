package ua.i.mail100;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Kitty");
        Dog dog1 = new Dog("Bobik");
        Baby baby1 = new Baby("Lena");

        // проверка  static void printHello()
        Play p = cat1;

        // default method
        cat1.sum(1, 2);
        dog1.sum(3, 5);

        // static method
        Play.printHello();

        // use inteface
        baby1.playWith(cat1);
        baby1.playWith(dog1);

    }
}
