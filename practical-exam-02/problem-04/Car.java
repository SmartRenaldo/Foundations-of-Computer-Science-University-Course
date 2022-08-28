//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 02
//===================================
public class Car {
    //attributes
    private String model;
    private int numGears;
    private float literTank;
    private int yearManufacture;

    //default constructor
    public Car() {
    }

    //a Constructor containing all parameters
    public Car(String model, int numGears, float literTank, int yearManufacture) {
        this.model = model;
        this.numGears = numGears;
        this.literTank = literTank;
        this.yearManufacture = yearManufacture;
    }

    //accessor
    public String getModel() {
        return model;
    }

    //mutator
    public void setModel(String model) {
        this.model = model;
    }

    //accessor
    public int getNumGears() {
        return numGears;
    }

    //mutator
    public void setNumGears(int numGears) {
        this.numGears = numGears;
    }

    //accessor
    public float getLiterTank() {
        return literTank;
    }

    //mutator
    public void setLiterTank(float literTank) {
        this.literTank = literTank;
    }

    //accessor
    public int getYearManufacture() {
        return yearManufacture;
    }

    //mutator
    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }
}

