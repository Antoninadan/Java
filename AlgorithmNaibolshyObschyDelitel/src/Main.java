public class Main {
    // the greatest common factor - наибольший общий делитель
    public static void main(String[] args) {

        int p = 60;
        int q = 18;

        System.out.println("the greatest common factor (" + p + "," + q + ") = " + gcf(p, q));
    }

    public static int gcf(int p, int q) {
        if (q == 0) {
            return p;
        }

        int r = p % q;
        {
            return gcf(q, r);
        }
    }

}
