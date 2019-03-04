package uaimail100;

public class Dog implements Play{

    @Override
    public String toString() {
        return "dog";
    }

    @Override
    public boolean canPlay() {
        return true;
    }

    @Override
    public String play() {
        return "play dog";
    }
}
