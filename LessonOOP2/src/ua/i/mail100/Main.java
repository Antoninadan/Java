package ua.i.mail100;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal(3, 4, true, "milk");
        Cat cat1 = new Cat(3, 4, true, "milk", "Barsic", "Angor", false);

        animal1 = cat1;

        voice(cat1);
        voice(animal1);

        cat1.showSex();

        System.out.println("sex from main (cat1.sex): " + cat1.sex);
        System.out.println();

        // abstract
        Triangular tr=new Triangular(3,4,5);
        Shape sp=tr;
        System.out.println(sp.calculateArea());
        ((Triangular) sp).triangularMethod();
        System.out.println();

        // enum
        EnumColor enumColor1 = EnumColor.BLUE;
        if (enumColor1 == EnumColor.BLUE) {
            System.out.println("Color BLUE");
        }

        System.out.println("Color = " + enumColor1.getColorCode());
        enumColor1.setColorCode("###$%$#%");
        System.out.println("Color = " + enumColor1.getColorCode());

        System.out.println(enumColor1.ordinal());

    }

    static public void voice(Animal animal) {
        animal.getVoice();
    }

}
