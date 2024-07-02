package june22;

public class FullTimeEmployee extends  Employee{

    public FullTimeEmployee(String employeeName, String employeeID) {
        super(employeeName, employeeID);
    }

    @Override
    public void calculatePay(double hours, double payRate) {
        super.calculatePay(hours,payRate);

    }
}

