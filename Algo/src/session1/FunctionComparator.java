package session1;

import java.util.Arrays;

public class FunctionComparator {
    public static void main(String[] args) {
        int[] xValues = {1,2,3,4,5};
        FunctionCalculator linear = new Linear(xValues);
        FunctionCalculator square = new Square(xValues);

        FunctionCalculator[] functions = {linear, square};

        long[] tempComparator = new long[functions.length];

        for (int i = 0; i < functions.length; i++) {
            tempComparator[i] = functions[i].sumFunction();
        }
        Arrays.sort(tempComparator);






        // TODO add all functions to array
        // TODO sort functions array by ordinates sum
        // TODO print functions in order by complexity
        for (FunctionCalculator function : functions) {
            System.out.println(function.sumFunction());
        }
    }
}
