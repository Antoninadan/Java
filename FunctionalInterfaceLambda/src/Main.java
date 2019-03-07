import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {

        FunctionalInterface fI;
        // static method-------------------------------------------------------------------------
        fI = TestClass::getStaticMethod;

        System.out.println("TestClass::getStaticMethod = " + fI.functionalMethod(1));

        // not static method---------------------------------------------------------------------
        TestClass tC = new TestClass();
        fI = tC::getMethod;

        System.out.println("tC::getMethod = " + fI.functionalMethod(1));

        // lambda simple------------------------------------------------------------------------
        fI = n -> n * 2;

        System.out.println("n -> n*2 = " + fI.functionalMethod(1));

        // lambda not simple--------------------------------------------------------------------
        fI = n -> {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        };

        System.out.println("{for \"5\"} = " + fI.functionalMethod(5));

        // lambda example - BinaryOperator------------------------------------------------------
        BinaryOperator<Integer> fIBinaryOperator;
        fIBinaryOperator = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

        System.out.println("fBinaryOperator.maxBy(98, 11) = " + fIBinaryOperator.apply(98,11));

        // lambda example - sort---------------------------------------------------------------
        Integer[] array = { -2, 100, -1, 4, -30, 500, 60, -8, 9 };
        Arrays.sort(array, (nOne, nTwo) -> (nOne - nTwo));
        System.out.println(Arrays.toString(array));


        // lambda example - sort with null-----------------------------------------------------
        Integer[] array2 = { -2, 100, -1, null, -30, 500, 60, -8, 9, null};
        Arrays.sort(array2, (nOne, nTwo) -> CheckNull.checkNull(nOne, nTwo) != CheckNull.NOT_NULL ? CheckNull.checkNull(nOne, nTwo)
                : (nOne - nTwo));
        System.out.println(Arrays.toString(array2));



    }


}
