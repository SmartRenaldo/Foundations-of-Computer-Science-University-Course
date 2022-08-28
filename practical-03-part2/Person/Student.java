public class Student extends Person {
    //attributes
    private double[] marks;
    private String[] disciplines;

    //method
    public double averageMarks(){
        double totalMark = 0;       //Total Mark
        for (double mark : marks) {
            totalMark += mark;
        }
        return totalMark / marks.length;        //average mark
    }

    //method
    public void displayDisciplines (){
        for (String discipline : disciplines) {
            System.out.println(discipline);
        }
    }

    //default constructor
    public Student() {
    }

    //Parametric Constructor
    public Student(String givenName, String lastName, int age, String gender,
                   String citizenship, double[] marks, String[] disciplines) {
        super(givenName, lastName, age, gender, citizenship);
        this.marks = marks;
        this.disciplines = disciplines;
    }

    //Mutator
    public double[] getMarks() {
        return marks;
    }

    //Accessor
    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    //Mutator
    public String[] getDisciplines() {
        return disciplines;
    }

    //Accessor
    public void setDisciplines(String[] disciplines) {
        this.disciplines = disciplines;
    }
}
