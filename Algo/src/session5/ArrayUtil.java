package session5;

public class ArrayUtil {
    public long sum(Integer[] vector) {
        if (vector == null) {
            return 0;
        }
        long sum = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null) {
                sum += vector[i];
            }
        }
        return sum;
    }
}