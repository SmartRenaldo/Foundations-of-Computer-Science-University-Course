public class MyQueue {
    private Node front;
    private Node rear;

    //initialise the an empty queue in the constructor
    public MyQueue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(String string) {
        this.enqueue(new Node(string));
    }

    // Insert one node at the end of the queue
    public void enqueue(Node node) {
        if (node == null) {
            System.out.println("Add failed! Node should not be null!");
        } else {
            if (this.isEmpty()) {
                this.front = node;
            }
            node.setNext(this.rear);
            this.rear = node;
        }
    }

    // Get and remove the front node from the queue.
    // Return Null and print "Queue is empty" when the queue is empty
    public String dequeue() {
        if (this.isEmpty()) {
            System.out.println("Can't remove, queue is empty");
            return null;
        } else if (this.rear.getNext() == null) {   // have only one element in queue
            String string = this.rear.getData();
            this.rear = null;
            return string;
        } else {
            Node tmp = this.rear;
            //traverse queue until reach the final element
            while (tmp.getNext().getNext() != null) {
                tmp = tmp.getNext();
            }
            //remove first element
            String string = tmp.getNext().getData();
            tmp.setNext(null);
            return string;
        }
    }

    // Return TRUE when the queue is empty, otherwise, return FALSE.
    public boolean isEmpty() {
        return this.rear == null;
    }

    // Print out the data saved in nodes from the first to the last.
    // Return and print "Queue is empty" when the queue is empty
    // You should call printNode() to print each node in this method.
    public void displayQueue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node flag = this.rear;
        while (flag != null) {
            flag.printNode();
            System.out.print(" --> ");
            flag = flag.getNext();
        }
    }
}
