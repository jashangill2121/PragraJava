package june22;

public class Car extends Vehicle {

    public Car(String make, String model, int year) {
        super(make, model, year);
    }

   private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    public void start(){
        System.out.println("Car has started");

    }

    public void displayInfo(){
        System.out.println("This car has 2 doors");
    }
}
