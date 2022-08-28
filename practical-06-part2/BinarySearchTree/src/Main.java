public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(8);
        Node node2 = new Node(9);
        node1.printNode();
        node2.printNode();

        //        6
        //      /   \
        //     3     8
        //    / \   / \
        //   2   4 7   9
        MyBST tree = new MyBST();
        tree.insert(6);
        tree.insert(3);
        tree.insert(8);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.insert(9);
        tree.insert(9);
        tree.insert(9);
        tree.insert(9);
        tree.insert(9);
        tree.insert(9);
        tree.printInOrder();
        tree.printPreOrder();
        tree.printPostOrder();
        System.out.println(tree.search(1));
        System.out.println(tree.search(2));
        System.out.println(tree.search(3));
        System.out.println(tree.search(4));
        System.out.println(tree.search(5));
    }
}
