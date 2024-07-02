package june22;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

   private int numCylinders;

    public Motorcycle(String make, String model, int year, int numCylinders) {
        super(make, model, year);
        this.numCylinders = numCylinders;
    }
    public void stop(){
        System.out.println("Bike has stopped");

    }
}
