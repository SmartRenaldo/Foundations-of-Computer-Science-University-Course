public class MyBST {
    //Attributes:
    private Node root; // The reference to the root node in this tree

    public MyBST() {
        this.root = null;
    }

    public MyBST(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    // Insert a new value into the tree. This method calls insertRec()
    public void insert(int value) {
        try {
            this.root = this.insertRec(this.root, value);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    // This is a recursive function to insert a new value in the tree.
    private Node insertRec(Node current, int value) throws RuntimeException {
        if (current == null) {
            current = new Node(value);
        } else if (value < current.getData()) {
            current.setLeft(this.insertRec(current.getLeft(), value));
        } else if (value > current.getData()) {
            current.setRight(this.insertRec(current.getRight(), value));
        } else {
            throw new RuntimeException("Node is in the tree");
        }

        return current;
    }

    // In-order traverse tree and printing
    public void printInOrder() {
        this.printInOrder(this.root);
        System.out.println();
    }

    private void printInOrder(Node node) {
        // Make sure tree/subtree is not empty
        if (node != null) {
            // Print left subtree
            this.printInOrder(node.getLeft());
            // Print root
            System.out.print(node.getData() + " ");
            // Print right subtree
            this.printInOrder(node.getRight());
        }
    }

    // Pre-order traverse tree and printing
    public void printPreOrder() {
        this.printPreOrder(this.root);
        System.out.println();
    }

    private void printPreOrder(Node node) {
        // Make sure tree/subtree is not empty
        if (node != null) {
            // Print root
            System.out.print(node.getData() + " ");
            // Print left subtree
            this.printPreOrder(node.getLeft());
            // Print right subtree
            this.printPreOrder(node.getRight());
        }
    }

    // Post-order traverse tree and printing
    public void printPostOrder() {
        this.printPostOrder(this.root);
        System.out.println();
    }

    private void printPostOrder(Node node) {
        // Make sure tree/subtree is not empty
        if (node != null) {
            // Print left subtree
            this.printPostOrder(node.getLeft());
            // Print right subtree
            this.printPostOrder(node.getRight());
            // Print root
            System.out.print(node.getData() + " ");
        }
    }

    // Search a node in the tree. This method calls searchRec()
    public boolean search(int value) {
        return this.searchRec(this.root, value);
    }

    // This is a recursive function to search a node in the tree.
    private boolean searchRec(Node current, int value) {
        if (current == null) {
            return false;
        } else if (value == current.getData()) {
            return true;
        } else if (value < current.getData()) {
            return this.searchRec(current.getLeft(), value);
        } else {
            return this.searchRec(current.getRight(), value);
        }
    }
}
