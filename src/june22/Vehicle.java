package june22;

public class Vehicle {
    private String make;
    private String model;
    private int year;


    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public void start(){
        System.out.println("Vehicle has started");

    }

    public void stop(){
        System.out.println("Vehicle has stopped");

    }

    public void displayInfo(){
        System.out.println("Make " + make);
        System.out.println("Model " + model);
        System.out.println("Year " + year);

    }
}
