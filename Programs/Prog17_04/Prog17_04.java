public class Prog17_04 {
    public static void main(String[] args) {
        new Prog17_04();
    }

    public Prog17_04() {
        String str = "Hello!";
        String[] arr = { "W", "o", "r", "l", "d" };
        printReverseString(str);
        printReverseArray(arr);
        printReverseArray2(arr);
    }

    public void printReverseString(String input) {
        int length = input.length();

        if (length == 0) {
            System.out.println();
            return;
        }

        String last = input.substring(length - 1);
        String rest = input.substring(0, length - 1);

        System.out.print(last);
        printReverseString(rest);
    }

    public void printReverseArray(String[] input) {
        printReverseArrayHelper(input, input.length - 1);
    }

    public void printReverseArrayHelper(String[] input, int lastPos) {
        if (lastPos < 0) {
            System.out.println();
            return;
        }

        String last = input[lastPos];

        System.out.print(last + " ");
        printReverseArrayHelper(input, lastPos - 1);
    }

    public void printReverseArray2(String[] input) {
        printReverseArrayHelper2(input, 0);
    }

    public void printReverseArrayHelper2(String[] input, int pos) {
        if (pos == input.length) {
            return;
        }

        printReverseArrayHelper2(input, pos + 1);

        String last = input[pos];
        System.out.print(last + " ");
    }
}
