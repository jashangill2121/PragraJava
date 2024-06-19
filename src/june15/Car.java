package june15;

public class Car extends Vehicle {
    int numberOfSeats;

    public Car(String make, String model, String year, String color, String type) {           // or use default constructor in Super class
        super(make, model, year, color, type);

    }

    public void brake(){
        System.out.println("Car brakes");

    }
}
