public class Node {
    //Attributes:
    private int data; // the data saved in this node
    private Node left; // the reference to its left child
    private Node right; // the reference to its right child

    // Print the data saved in the node.
    public void printNode() {
        System.out.println("Node = " + this.getData());
    }

    public Node() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
