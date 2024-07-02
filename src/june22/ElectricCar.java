package june22;

public class ElectricCar extends Car {
    public ElectricCar(String make, String model, int year) {
        super(make, model, year);
    }

   private int batteryCapacity;

    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery(){
        System.out.println("Battery is low, please put it on charge");

    }
}
