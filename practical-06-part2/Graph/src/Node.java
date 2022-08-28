public class Node {
    //Attributes:
    private int index; // the index of this node
    private Node next;

    // Print the data (the index) saved in the node.
    public void printNode() {
        System.out.print(this.index);
    }

    public Node() {
        this.next = null;
    }

    public Node(int index) {
        this.index = index;
        this.next = null;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
