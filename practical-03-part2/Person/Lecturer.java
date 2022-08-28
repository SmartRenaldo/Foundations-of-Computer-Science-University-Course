public class Lecturer extends Person {
    //attributes
    private double salary;
    private String[] disciplines;

    //method
    public double annualSalary() {
        return salary * 12;
    }

    //method
    public void displayDisciplines() {
        for (String discipline : disciplines) {
            System.out.println(discipline);
        }
    }

    //default constructor
    public Lecturer() {
    }

    //Parametric Constructor
    public Lecturer(String givenName, String lastName, int age, String gender,
                    String citizenship, double salary, String[] disciplines) {
        super(givenName, lastName, age, gender, citizenship);
        this.salary = salary;
        this.disciplines = disciplines;
    }

    //Mutator
    public double getSalary() {
        return salary;
    }

    //Accessor
    public void setSalary(double salary) {
        this.salary = salary;
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
