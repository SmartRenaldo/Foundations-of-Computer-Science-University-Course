public class Doctor extends Person {
    //attribute
    private String speciality;

    //Basic Constructor
    public Doctor() {
    }

    //Parametric Constructor
    public Doctor(String givenName, String lastName, int age, String gender,
                  String citizenship, String speciality) {
        super(givenName, lastName, age, gender, citizenship);
        this.speciality = speciality;
    }

    //Mutator
    public String getSpeciality() {
        return speciality;
    }

    //Accessor
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
