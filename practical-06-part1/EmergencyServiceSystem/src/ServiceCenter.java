import java.util.Scanner;

public class ServiceCenter {
    private WaitingList awl;

    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /**
     * Record patient's data and add the patient into waiting list
     *
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */
    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location);
        if (this.awl.isInList(patient)) {
            System.out.println(patient.getName() + " is in waiting list. ");
        } else {
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }

    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     *
     * @return the patient object
     */
    public Patient assignAmbulanceForPatient() {
        if (this.awl.head == null) {
            System.out.println("Error! The waiting list is empty.");
            return null;
        } else {
            Patient patient = this.awl.popPatient();
            System.out.println("Assigned an ambulance for patient: " + patient.getName());
            return patient;
        }
    }

    /**
     * Print out the waiting list
     */
    public void printWaitingList() {
        this.awl.printList();
    }

    public void assignAmbulanceForPatientById() {
        if (this.awl.head == null) {
            //empty list
            System.out.println("Error! The waiting list is empty.");
        } else {    //non empty list
            System.out.println("Please enter the ID:");
            Scanner scanner = new Scanner(System.in);
            int id = 0;
            while (true) {
                if (scanner.hasNextInt()) {
                    id = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Error! ID should be an integer. Please enter again: ");
                    scanner = new Scanner(System.in);
                }
            }
            Node node = this.awl.head;

            //store the node before found node
            Node flag = null;
            while (node != null) {
                if (node.getPatient().getId() == id) {
                    break;
                }
                flag = node;
                node = node.getNext();
            }

            //already find the node
            if (node != null) {
                //only have one node and numbers match
                if (this.awl.head.getNext() == null) {
                    int i = this.awl.head.getPatient().getId();
                    this.awl.head = null;
                    System.out.printf("Success! An ambulance as assigned for patient %d\n.", i);
                    //at lease 2 nodes
                } else {
                    int i = node.getPatient().getId();
                    flag.setNext(node.getNext());
                    System.out.printf("Success! An ambulance as assigned for patient %d\n.", i);
                }
            }
        }

    }

    public void checkPositionById() {
        if (awl == null) {
            //empty list
            System.out.println("Error! There is no patient!");
        } else {    //non empty list
            Scanner scanner = new Scanner(System.in);
            int id = 0;
            System.out.println("Please enter the ID:");
            while (true) {
                if (scanner.hasNextInt()) {
                    id = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Error! ID should be an integer. Please enter again: ");
                    scanner = new Scanner(System.in);
                }
            }
            Node node = this.awl.head;
            //record how many patients before the given patients
            int count = 0;
            while (node != null) {
                if (node.getPatient().getId() == id) {
                    break;
                }
                count++;
                node = node.getNext();
            }
            if (count == this.awl.numNodes) {
                System.out.println("Error! No such ID!");
            } else {
                System.out.printf("There are %d patients before patient %d.\n", count, id);
            }
        }
    }
}
