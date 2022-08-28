public class Node {
    // the data saved in this node
    private String data;
    // the reference to another node
    private Node next;

    public void printNode() {
        System.out.print(this.data);
    }

    public Node() {
    }

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
