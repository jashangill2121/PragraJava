package may25;

import java.util.Scanner;

public class Assignement3 {
    public static void main(String[] args) {

        Scanner triangle = new Scanner(System.in);

        System.out.println("Enter the length of 1st side");
        int x = triangle.nextInt();

        System.out.println("Enter the length of 2nd side");
        int y = triangle.nextInt();

        System.out.println("Enter the length of 3rd side");
        int z = triangle.nextInt();

        if (x==y && x==z){
            System.out.println("The triangle is equilateral");
        }
       else if (x==y || x==z){
            System.out.println("The triangle is isosceles");
        }
       else{
            System.out.println("The triangle is scalene");
        }
    }
}
