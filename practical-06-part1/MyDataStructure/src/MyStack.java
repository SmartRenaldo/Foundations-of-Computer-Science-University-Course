public class MyStack {
    private Node top;

    //initialise an empty stack in the constructor
    public MyStack() {
        this.top = null;
    }

    // Push a node into stack
    public void push(Node node) {
        node.setNext(this.top);
        this.top = node;
    }

    public void push(String str){
        this.push(new Node(str));
    }

    // Get and remove the top node from this stack.
    // Return Null and print "Stack is empty" when the stack is empty.
    public Node pop() {
        if (this.top == null) {
            System.out.println("Stack is empty");
            return null;
        }
        Node tmp = this.top;
        this.top = this.top.getNext();
        return tmp;
    }

    // Get the top node in this stack.
    // Return Null and print "Stack is empty" when the stack is empty.
    public Node peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        return this.top;
    }

    //peek top element
    public String peekEle(){
        if (top == null) {
            System.out.println("Stack is empty");
        }
        return this.top.getData();
    }

    // Return TRUE when the stack is empty, otherwise, return FALSE.
    public boolean isEmpty() {
        return top == null;
    }
}
