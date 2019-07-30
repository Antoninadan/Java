package session5;

public class RecurEx {
    public static void main(String[] args) {
        System.out.println("fib(5) = " + new RecurEx().fib(6));
        //new RecurEx().infinit(4);
        //new RecurEx().print(4); // 4 3 2 1
//        new RecurEx().printRevert(4, 0); // 1 2 3 4
        //for(;;);

        // test (0-1 Knapsack problem)------------------------------------------------------------------------------
        int[] profit = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        // Объём рюкзака
        int capacity = 7;
        System.out.println("Knapsack value is " + Knapsack.knapSack(profit, weights, profit.length - 1, capacity));
    }

    // fibbonachi
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        final int fib2 = fib(n - 2);
        final int fib1 = fib(n - 1);
        return fib2 + fib1;
    }

    public void printRev(int n) {
        printRevert(n, 0);
    }

    private void printRevert(int n, int i) {
        if (i == n) {
            return;
        }
        System.out.println(i + 1);
        printRevert(n, i + 1);
    }

    public void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    public void infinit(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Infinit");
        //
        infinit(n - 1);

        System.out.println("exit");
    }

    // Рюкзак 0-1 (0-1 Knapsack Problem) ------------------------------------------------------------------------------
    public static class Knapsack {
        /**
         * @param profits  стоимость предметов
         * @param weights  веса предметов
         * @param n        количество предметов
         * @param capacity объём рюкзака
         * @return максимальная стоимость предметов
         */
        public static int knapSack(int[] profits, int[] weights, int n, int capacity) {
            // основной случай: отрицательный объём
            if (capacity < 0) {
                return Integer.MIN_VALUE;
            }

            // основной случай: больше нет предметов или нулевой объём
            if (n < 0 || capacity == 0) {
                return 0;
            }

            // Case 1. Включить текущий элемент n в рюкзак(profits[n]) и рекурсивный вызов для
            // оставшихся элементов (n - 1) с уменьшенным объёмом(capacity - weights[n])
            System.out.println("profits = " + profits[n] + " - n = " + n);
            int include = profits[n] + knapSack(profits, weights, n - 1, capacity - weights[n]);
            System.out.println("include = " + include);

            System.out.println("n2 = " + n);
            // Case 2. Иключить текущий элемент n из рюкзака и рекурсивный вызов для оставшихся элементов (n - 1)
            int exclude = knapSack(profits, weights, n - 1, capacity);
            System.out.println("exclude = " + exclude);

            // выбираем наибольшее значения из двух случаев - включая текущий предмет или не включая
            return Math.max(include, exclude);
        }
    }


}