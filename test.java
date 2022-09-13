public class test {
    private static final int SIZE = 10;
    private int[] list = new int[SIZE];
    private int length;

    public test() {
        this.length = 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public void insert(int x) {
        if (length == SIZE) {
            System.out.println("Insertion Error");
        }

        list[length] = x;
        length++;
    }

    public void removeAt(int pos) {

    }

    @Override
    public void print() {
        for (int i = 0; i < SIZE; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

}
