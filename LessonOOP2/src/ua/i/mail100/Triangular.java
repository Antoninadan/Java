package ua.i.mail100;

public class Triangular extends Shape {
    double a;
    double b;
    double c;

    public Triangular(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculatePerimetr() {
        return a + b + c;
    }

    @Override
    double calculateArea() {
        double polP = (a + b + c) / 2;
        return Math.sqrt(polP * (polP - a) * (polP - b) * (polP - c));
    }

    @Override
    double calculateFinal() {
        return 0;
    }

    public void triangularMethod() {
        System.out.println("triangularMethod");
    }

}