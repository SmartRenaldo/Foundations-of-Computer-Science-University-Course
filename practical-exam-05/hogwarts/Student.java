/*==================================
Foundations of Computer Science
Student: Yiqi Li
id: a1787585
Semester: S2
Year:2020
Practical Exam Number: 5
===================================*/

class Student {
    // attribute
    String name;
    int age;
    int period;

    // constructor
    public Student() {
        this.name = "unknown";
        this.age = 0;
        this.period = 0;
    }

    // constructor with parameter
    // add your code here
    public Student(String name, int age, int period) {
        this.name = name;
        this.age = age;
        this.period = period;
    }


    // write printStudent() method
    public void printStudent() {
        System.out.println("Printing student record");
        System.out.println("Name:   " + this.name);
        System.out.println("Age:    " + this.age);
        System.out.println("Period: " + this.period);
    }

    // mutators
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setPeriod(int period) {
        this.period = period;
    }

    // accessors
    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    int getPeriod() {
        return this.period;
    }
}
