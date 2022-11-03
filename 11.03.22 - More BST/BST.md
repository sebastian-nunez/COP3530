# Binary Search Trees (Part II)

```java
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

    public int getCount() {
        return getCount(this.root.getLeftChild());
    }

    private int getCount(Node node) {
        if (node == null)
            return 0;

        return 1 + getCount(node.getLeftChild()) + getCount(node.getRightChild());
    }

    /**
     * Height = length between root and deepest leaf
     * @return
     */
    public int getHeight() {
        return getHeight(root.getLeftChild());
    }

    private int getHeight(Node node) {
        if (node == null)
            return -1;

        return 1 + Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild()));
    }

    @Override
    public String toString() {
        return toString(this.root.getLeftChild());
    }

    private String toString(Node p) {
        if (p == null)
            return "";

        return toString(p.getLeftChild())
                + p.getInfo() + ", "
                + toString(p.getRightChild());
    }

    /**
     * Determines the number of occurrences of 'x' in the tree
     * @param x value to look for
     * @return number of occurrences
     */
    public int count(int x) {
        return count(this.root.getLeftChild(), x);
    }

    private int count(Node p, int x) {
        if (p == null) {
            return 0;
        }

        if (x == p.getInfo()) {
            return 1 + count(p.getRightChild(), x); // values >= x go to the right
        } else if (x < p.getInfo()) {
            return count(p.getLeftChild(), x);
        } else {
            return count(p.getRightChild(), x);
        }
    }

    /**
     * Determines the max value stored in the tree
     * @return max value
     */
    public int getMax() {
        Node node = this.root.getLeftChild();

        if (node == null) {
            return -1;
        }

        while (node != null) {
            node = node.getLeftChild()
        }
    }
}

```
