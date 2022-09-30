import java.util.HashMap;

public class Prog17_02 {
    public static void main(String[] args) {
        // HashMap<Integer, Long> memo = new HashMap<Integer, Long>();

        for (int n = 0; n <= 100; n++)
            System.out.println("" + n + ": " + fib(n, null));
    }

    public static int fib(int n) {
        if (n < 0) {
            System.out.println("n must be a positive integer!");
            return -1;
        }

        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static long fib(int n, HashMap<Integer, Long> memo) {
        if (n < 0) {
            System.out.println("n must be a positive integer!");
            System.exit(1);
        }

        if (memo == null) {
            memo = new HashMap<Integer, Long>();
        }

        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;

        if (!memo.containsKey(n)) {
            long result = fib(n - 1, memo) + fib(n - 2, memo);

            if (result < 0) {
                System.out.println("OVERFLOW!");
                System.exit(1);
            }

            memo.put(n, result);
        }

        return memo.get(n);
    }
}
