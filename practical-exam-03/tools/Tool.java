//==================================
// Foundations of Computer Science
// Student: YIQI LI
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 3
//===================================
public abstract class Tool implements Asset{
    //variables
    float weight;
    float value;

    //constructor

    public Tool(float weight, float value) {
        this.weight = weight;
        this.value = value;
    }

    //accessor
    public float getWeight() {
        return weight;
    }

    //accessor
    @Override
    public float getValue() {
        return value;
    }

    //representing the number of times the tool is used
    public abstract void useTool(int num);
}
