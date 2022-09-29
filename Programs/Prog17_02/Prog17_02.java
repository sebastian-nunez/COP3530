import java.util.Stack;

public class Prog17_02 {
    public static void main(String[] args) {
        System.out.println(series(3));
        System.out.println(seriesIterative(3));
    }

    public static int series(int n) {
        if (n == 0)
            return 5;

        return 2 * series(n - 1) + 3;
    }

    public static int seriesIterative(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 5;

        stack.push(n);
        while (stack.size() > 0) {
            int current = stack.pop();

            result += 2 * current + 3;

            if (n > 0)
                stack.push(n - 1);
        }

        return result;
    }
}
