package june22;

public class Employee {
    private String employeeName;
    private String employeeID;

    public Employee(String employeeName, String employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }



    public void calculatePay(double hours, double payRate){

        double salary = hours * payRate;
        System.out.println("Salary of employee " + employeeID + "(" + employeeName + ") is $" + salary);

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeID='" + employeeID + '\'' +
                '}';
    }
}
