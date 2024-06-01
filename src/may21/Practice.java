package may21;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner user=new Scanner(System.in);
        System.out.println("User registration");
        System.out.println();

        System.out.println("Enter first name");
        String firstName=user.nextLine();

        System.out.println("Enter last name");
        String lastName=user.nextLine();

        System.out.println("Enter email address");
        String email=user.nextLine();

        System.out.println("Enter phone number");
        String phone=user.nextLine();

        System.out.println("Enter address");
        String address=user.nextLine();


        System.out.println("Enter Salary");
        double salary=user.nextDouble();


        System.out.println("User registered successfully and here are the details ");
        System.out.println("First name is "+ firstName);
        System.out.println("Last name is "+ lastName);
        System.out.println("Email address is "+ email);
        System.out.println("Phone number is "+ phone);
        System.out.println("Address is "+ address);
        System.out.println("Salary is "+ salary);
    }
}
