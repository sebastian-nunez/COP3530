/**
* @author A. Hernandez
* Data Structures and Algorithms
*/
public class Node {
    private int info; //element stored in this node
    private Node left; //link to left child
    private Node right; //link to right child

    public Node() {
        this.info = 0;
        this.left = null;
        this.right = null;
    }

    public void setNode(int x, Node l, Node r) {
        this.info = x;
        this.left = l;
        this.right = r;
    }

    public int getInfo() {
        return this.info;
    }

    public Node getLeftChild() {
        return this.left;
    }

    public Node getRightChild() {
        return this.right;
    }

    public void setInfo(int x) {
        this.info = x;
    }

    public void setLeftChild(Node l) {
        this.left = l;
    }

    public void setRightChild(Node r) {
        this.right = r;
    }
}
