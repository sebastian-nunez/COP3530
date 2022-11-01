public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("empty? " + bst.isEmpty());

        bst.add(25);
        bst.add(5);
        bst.add(37);
        bst.add(8);
        bst.add(9);
        bst.add(6);
        bst.add(29);
        bst.add(42);
        bst.add(27);

        System.out.println(bst);
        System.out.println("12 is found: " + bst.contains(12));
        System.out.println("99 is found: " + bst.contains(99));
    }
}
