package may25;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {

        Scanner leapYear=new Scanner(System.in);

        System.out.println("Enter a year");
        int year=leapYear.nextInt();

        if (year%4==0){
            System.out.println("This is a leap year");

        }
        else {
            System.out.println("This is not a leap year");
        }
    }
}
