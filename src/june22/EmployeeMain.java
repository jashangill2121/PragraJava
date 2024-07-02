package june22;

public class EmployeeMain {
    public static void main(String[] args) {


        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Jashan","2121");
        fullTimeEmployee.calculatePay(40.5,35);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Aman","2122");
        partTimeEmployee.calculatePay(20,33);

    }
}
