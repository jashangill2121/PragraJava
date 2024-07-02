package june22;

import java.sql.SQLOutput;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Honda","Civic",2022);
        vehicle.displayInfo();

        Car car = new Car("Dodge","Challenger",2021,2);
        car.displayInfo();


        ElectricCar electricCar = new ElectricCar("Tesla","X",2023,45);
        electricCar.chargeBattery();



    }
}
