package may25;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a country name to get the capital");

        String input=obj.next();

        switch(input) {

            case "Canada":
                System.out.println("Ottawa");
            break;
            case "India":
                System.out.println("New Delhi");
            break;
            case "New Zealand":
                System.out.println("Wellington");
            break;
            default:
                System.out.println("Please enter correct input");
        }
    }
}
