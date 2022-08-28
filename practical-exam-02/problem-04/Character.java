//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 02
//===================================
public class Character {
    //attributes
    private String name;    //this attribute storage the character name
    private int age;    // this attribute storage the character age
    private String gender;  // this attribute storage the character gender
    private String occupation;  // this attribute storage the character occupation
    private String familyRole;  // this attribute storage the family role
    private float rate;     // this attribute storage the character overall rate by fans

    //default constructor
    public Character() {
    }

    //a Constructor containing all parameters
    public Character(String name, int age, String gender, String occupation, String familyRole, float rate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.familyRole = familyRole;
        this.rate = rate;
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
    public int getAge() {
        return age;
    }

    //mutator
    public void setAge(int age) {
        this.age = age;
    }

    //accessor
    public String getGender() {
        return gender;
    }

    //mutator
    public void setGender(String gender) {
        this.gender = gender;
    }

    //accessor
    public String getOccupation() {
        return occupation;
    }

    //mutator
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    //accessor
    public String getFamilyRole() {
        return familyRole;
    }

    //mutator
    public void setFamilyRole(String familyRole) {
        this.familyRole = familyRole;
    }

    //accessor
    public float getRate() {
        return rate;
    }

    //mutator
    public void setRate(float rate) {
        this.rate = rate;
    }
}

