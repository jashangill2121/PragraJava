package may21;


import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {


        Scanner greatestOfAll = new Scanner(System.in);

        System.out.println("Enter the value for X");
        double x = greatestOfAll.nextDouble();

        System.out.println("Enter the value for Y");
        double y = greatestOfAll.nextDouble();

        System.out.println("Enter the value for Z");
        double z = greatestOfAll.nextDouble();

        if (x > y && x > z) {

            System.out.println("X is greater");

        }
        else if (y > x && y > z) {

            System.out.println("Y is greater");
        }
        else {

            System.out.println("Z is greater");
        }

    }
}
