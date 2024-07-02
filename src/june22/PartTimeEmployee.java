package june22;

public class PartTimeEmployee  extends  Employee{
    public PartTimeEmployee(String employeeName, String employeeID) {
        super(employeeName, employeeID);
    }

    @Override
    public void calculatePay(double hours, double payRate) {
        super.calculatePay(hours, payRate);
    }
}
