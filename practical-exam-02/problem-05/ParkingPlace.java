//==================================
// Foundations of Computer Science
// Student: Yiqi Li
// id: your a1787585
// Semester: 2
// Year: 2020
// Practical Exam Number: 02
//===================================
public class ParkingPlace {
    //attributes
    private String owner;
    private String address;
    private String type;
    private String vehicle;
    private int price;

    //a Constructor containing all parameters
    public ParkingPlace(String owner, String address, String type, String vehicle) {
        this.owner = owner;
        this.address = address;
        this.type = type;
        this.vehicle = vehicle;
    }

    //mutator
    public void setPrice(int price) {
        this.price = price;
    }

    //accessor
    public int getPrice(){
        if(address.equals("off-street")){
            return 15;
        }
    }

    //accessor
    public String getOwner() {
        return owner;
    }

    //mutator
    public void setOwner(String owner) {
        this.owner = owner;
    }

    //accessor
    public String getAddress() {
        return address;
    }

    //mutator
    public void setAddress(String address) {
        this.address = address;
    }

    //accessor
    public String getType() {
        return type;
    }

    //mutator
    public void setType(String type) {
        this.type = type;
    }

    //accessor
    public String getVehicle() {
        return vehicle;
    }

    //mutator
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}

