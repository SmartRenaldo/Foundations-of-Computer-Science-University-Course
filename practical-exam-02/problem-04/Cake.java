//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 02
//===================================
public class Cake {
    //attributes
    private String name;
    private float qtSugar;
    private float qtFlour;
    private float qtYeast;
    private double timePrepare;

    //default constructor
    public Cake() {
    }
    
    //a Constructor containing all parameters
    public Cake(String name, float qtSugar, float qtFlour, float qtYeast, double timePrepare) {
        this.name = name;
        this.qtSugar = qtSugar;
        this.qtFlour = qtFlour;
        this.qtYeast = qtYeast;
        this.timePrepare = timePrepare;
    }

    //accessor
    public String getName() {
        return name;
    }

    //mutator
    public void setName(String name) {
        this.name = name;
    }

    //accessor
    public float getQtSugar() {
        return qtSugar;
    }

    //mutator
    public void setQtSugar(float qtSugar) {
        this.qtSugar = qtSugar;
    }

    //accessor
    public float getQtFlour() {
        return qtFlour;
    }

    //mutator
    public void setQtFlour(float qtFlour) {
        this.qtFlour = qtFlour;
    }

    //accessor
    public float getQtYeast() {
        return qtYeast;
    }

    //mutator
    public void setQtYeast(float qtYeast) {
        this.qtYeast = qtYeast;
    }

    //accessor
    public double getTimePrepare() {
        return timePrepare;
    }

    //mutator
    public void setTimePrepare(double timePrepare) {
        this.timePrepare = timePrepare;
    }
}
