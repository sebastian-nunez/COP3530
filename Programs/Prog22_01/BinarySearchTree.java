/**
* @author A. Hernandez
* Data Structures and Algorithms
*/
public class BinarySearchTree {
    public BinarySearchTree() {
        root = new Node(); //dummy node as the root
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setInfo(-1);
    }

    public boolean isEmpty() {
        return root.getLeftChild() == null;
    }

    public void display() {
        System.out.print("Pre order: ");
        preorderDisplay(root.getLeftChild());
        System.out.println();

        System.out.print("In order: ");
        inorderDisplay(root.getLeftChild());
        System.out.println();

        System.out.print("Postorder: ");
        postorderDisplay(root.getLeftChild());
        System.out.println();
    }

    public boolean contains(int x) {
        return search(x, root.getLeftChild());
    }

    public void add(int x) {
        if (root.getLeftChild() == null) {
            Node p = new Node();
            p.setNode(x, null, null);
            root.setLeftChild(p);
        } else
            insert(x, root.getLeftChild());
    }

    public int getMin() {
        return getMin(root);
    }

    private Node root; //root of the bst; implemented as a dummy node.

    private void inorderDisplay(Node p) {
        if (p == null)
            return;

        inorderDisplay(p.getLeftChild());
        System.out.print(p.getInfo() + ", ");
        inorderDisplay(p.getRightChild());
    }

    private void preorderDisplay(Node p) {
        if (p == null)
            return;

        System.out.print(p.getInfo() + ", ");
        inorderDisplay(p.getLeftChild());
        inorderDisplay(p.getRightChild());
    }

    private void postorderDisplay(Node p) {
        if (p == null)
            return;

        inorderDisplay(p.getLeftChild());
        inorderDisplay(p.getRightChild());
        System.out.print(p.getInfo() + ", ");
    }

    private boolean search(int x, Node p) {
        if (p == null)
            return false;
        else if (x == p.getInfo())
            return true;
        else if (x < p.getInfo())
            return search(x, p.getLeftChild());
        else
            return search(x, p.getRightChild());
    }

    private void insert(int x, Node p) {
        if (x < p.getInfo()) {
            if (p.getLeftChild() == null) {
                Node q = new Node();
                q.setNode(x, null, null);
                p.setLeftChild(q);
            } else {
                insert(x, p.getLeftChild());
            }
        } else {
            if (p.getRightChild() == null) {
                Node q = new Node();
                q.setNode(x, null, null);
                p.setRightChild(q);
            } else {
                insert(x, p.getRightChild());
            }
        }
    }

    private int getMin(Node p) {
        if (p.getLeftChild() == null)
            return p.getInfo();

        return getMin(p.getLeftChild()); // explore left subtrees until you bottom out
    }
}
