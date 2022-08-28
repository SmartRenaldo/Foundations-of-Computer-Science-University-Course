public class WaitingList {
    protected Node head;
    protected int numNodes;

    public WaitingList() {
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     *
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {
        if (this.head == null) {
            return null;
        }
        Patient patient = this.head.getPatient();
        this.head = this.head.getNext();
        this.numNodes--;
        return patient;
    }

    /**
     * This method will add patient into the waiting list according to the triage level
     *
     * @param patient patient's data
     */
    public void addToList(Patient patient) {
        if (patient == null) {
            System.out.println("Patient cannot be null! Add failed!");
        } else {
            if (this.head == null) {
                //no patient
                this.head = new Node(patient);
            } else {     //at lease one patient
                //       triage level of new patient >= ahead patient
                if (isTriageOrder(this.getRare().getPatient(), patient)) {
                    this.getRare().setNext(new Node(patient));
                } else {
                    //find the right place for new patient
                    //if new Node should be new head
                    if (!isTriageOrder(this.head.getPatient(),patient)) {
                        Node newHead = new Node(patient);
                        newHead.next = this.head;
                        this.head = newHead;
                    } else {
                        //Node >= 2
                        Node tmp = this.head;
                        while (tmp.getNext() != null) {
                            if (!this.isTriageOrder(tmp.getNext().getPatient(), patient)) {
                                break;
                            }
                            tmp = tmp.getNext();
                        }
                        Node node = new Node(patient);
                        Node nextNode = tmp.getNext();
                        tmp.setNext(node);
                        node.setNext(nextNode);
                    }
                }
            }
            this.numNodes++;
        }
    }

    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {
        if (this.head == null) {
            System.out.println("Please add patient first and then check information!");
        } else {
            System.out.println("Name                Triage Level        Phone Number        " +
                    "Location            ID");
            Node tmp = this.head;
            while (tmp != null) {
                tmp.printNode();
                tmp = tmp.getNext();
            }
        }
    }

    /**
     * Check whether the patient is in this list or not
     *
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while (temp != null) {
            if (temp.getPatient().getName().equals(patient.getName())
                    && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    /**
     * determine whether the last patient's triage level <= new patient's triage level
     *
     * @param patient1, patient2
     * @return
     */
    private boolean isTriageOrder(Patient patient1, Patient patient2) {
        if (this.head == null) {
            System.out.println("Waiting List cannot be empty! Program exit!");
            System.exit(1);
        }
        return patient1.getTriageLevel() <= patient2.getTriageLevel();
    }

    /**
     * get the last element in the patient list
     *
     * @return
     */
    private Node getRare() {
        if (this.head == null) {
            return null;
        } else {
            Node tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            return tmp;
        }
    }
}
