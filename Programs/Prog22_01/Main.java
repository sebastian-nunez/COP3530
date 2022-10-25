public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        BinarySearchTree bts = new BinarySearchTree();
        System.out.println("empty? " + bts.isEmpty());

        bts.add(4);
        bts.add(7);
        bts.add(8);
        bts.add(12);
        bts.add(16);
        bts.add(11);
        bts.add(1);
        bts.add(1);

        bts.display();
        System.out.println("12 is found: " + bts.contains(12));
        System.out.println("99 is found: " + bts.contains(99));
    }
}
