public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        BinarySearchTree bts = new BinarySearchTree();
        System.out.println("empty? " + bts.isEmpty());

        bts.add(25);
        bts.add(5);
        bts.add(37);
        bts.add(8);
        bts.add(9);
        bts.add(6);
        bts.add(29);
        bts.add(42);
        bts.add(27);

        bts.display();
        System.out.println("12 is found: " + bts.contains(12));
        System.out.println("99 is found: " + bts.contains(99));
    }
}
