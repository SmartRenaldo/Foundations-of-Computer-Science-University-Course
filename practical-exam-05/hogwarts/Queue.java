/*==================================
Foundations of Computer Science
Student: Yiqi Li
id: a1787585
Semester: S2
Year:2020
Practical Exam Number: 5
===================================*/

public class Queue {
    /*
    properties:
    front - the front of the queue is where the first Node was enqueued;
    back - the back of the queue is where the last Node is enqueued;
    */
    private Node front;
    private Node back;

    //add student to back of queue
    public void enqueue(Student tmpStudent) {
        // Create a new node
        Node node = new Node(tmpStudent);
        // If queue is empty, then new node is front and back both
        if (this.back == null) {
            this.front = this.back = node;
            return;
        }

        // Add the new node at the end of queue and change back
        this.back.setNext(node);
        this.back = node;
    }

    // remove student at front of queue
    public Student dequeue() {
        // If queue is empty, return null
        if (this.front == null) {
            return null;
        }

        // Store previous front and move front one node ahead
        Node tmp = this.front;
        this.front = this.front.getNext();

        // If front becomes null, then change back also as null
        if (this.front == null) {
            this.back = null;
        }

        return tmp.getInfo();
    }

    // return name of student at front of queue
    public String peek() {
        //If the queue is empty it should return the empty string.
        if (this.front == null) {
            return "";
        }
        return this.front.getInfo().getName();
    }

    // print queue list
    public void displayQueue() {
        /*
        If the queue is empty, the method displayQueue should print
        "There are no students waiting for a scholarship"
        */
        if (this.front == null) {
            System.out.println("There are no students waiting for a scholarship");
            return;
        }
        Node flag = this.front;
        int count = 0;
        while (flag != null) {
            count++;
            //need category discussion for different period
            if (flag.getInfo().getPeriod()==1) {
                System.out.printf("#%d %s, %d years old, 1st year in Hogwarts;\n",
                        count, flag.getInfo().getName(), flag.getInfo().getAge());
            }else if (flag.getInfo().getPeriod()==2) {
                System.out.printf("#%d %s, %d years old, 2nd year in Hogwarts;\n",
                        count, flag.getInfo().getName(), flag.getInfo().getAge());
            }else if (flag.getInfo().getPeriod()==3) {
                System.out.printf("#%d %s, %d years old, 3rd year in Hogwarts;\n",
                        count, flag.getInfo().getName(), flag.getInfo().getAge());
            }
            flag = flag.getNext();
        }

    }

    //constructor
    public Queue() {
    }

    //accessors
    public Node getFront() {
        return front;
    }

    public Node getBack() {
        return back;
    }
}
