//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: final
//===================================
public class Person {
    //attributes
    private String name;
    private int age;

    //default constructor
    public Person() {
        this.name = "anon";
        this.age = -1;
    }

    //a constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    //a toString() method
    @Override
    public String toString() {
        return "Person: " + this.name + " is age: " + this.age;
    }
}
