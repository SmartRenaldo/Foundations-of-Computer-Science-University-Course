/*==================================
Foundations of Computer Science
Student: Yiqi Li
id: a1787585
Semester: S2
Year:2020
Practical Exam Number: 5
===================================*/

public class Node {
    //properties: next (Node), info (Student)
    private Node next;
    private Student info;

    // Basic constructor: Node()
    public Node() {
    }

    //Constructor with parameter for student: Node(Student tmpStudent)
    public Node(Student info) {
        this.info = info;
    }

    //accessors and mutators
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getInfo() {
        return info;
    }

    public void setInfo(Student info) {
        this.info = info;
    }
}
