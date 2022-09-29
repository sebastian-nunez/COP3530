import java.util.HashMap;

public class Prog17_02 {
    public static void main(String[] args) {
        HashMap<Integer, Long> memo = new HashMap<Integer, Long>();

        // for (int n = 0; n <= 100; n++)
        System.out.println(fibMemo(499, memo));
    }

    public static int fib(int n) {
        if (n < 0) {
            System.out.println("n must be a positive integer!");
            return -1;
        }

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    public static long fibMemo(int n, HashMap<Integer, Long> memo) {
        if (n < 0) {
            System.out.println("n must be a positive integer!");
            return -1;
        }

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        if (!memo.containsKey(n))
            memo.put(n, fibMemo(n - 1, memo) + fibMemo(n - 2, memo));

        return memo.get(n);
    }
}
