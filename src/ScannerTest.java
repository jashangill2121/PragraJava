import java.util.Scanner;

public class ScannerTest {
    public static void main (String[] args ) {
                   Scanner sc= new Scanner(System.in);

                   System.out.println("Enter the First name");
                   String firstName= sc.next();

        System.out.println("Enter the last name");
        String lastName= sc.next();

        System.out.println("Enter the email name");
        String email= sc.next();

        System.out.println("Enter the phone number");
        String phone= sc.next();

        System.out.println("Enter the address");
        String address= sc.next();



        System.out.println("User registration");

        System.out.println("First name" +firstName);
        System.out.println("Last name"   + lastName);
        System.out.println("email"  +email);
        System.out.println("ph  mbr"  + phone);
        System.out.println("address"  + address);



    }
}
