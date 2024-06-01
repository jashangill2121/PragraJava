package may25;

import may28.NewCalc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("***************");
        System.out.println("Welcome to my calculator");
        System.out.println("***************");

        System.out.println("1: Press 1 for Addition");
        System.out.println("2: Press 2 for Subtraction");
        System.out.println("3: Press 3 for Multiplication");
        System.out.println("4: Press 4 for Division");
        System.out.println("5: Press 5 for Modulus");
        System.out.println("6: Press 6 to exit");



        NewCalc test = new NewCalc();

        Scanner input=new Scanner(System.in);
        int calc= input.nextInt();

        switch(calc) {

            case 1:

                System.out.println("Addition of both numbers is "+ test.add());

                break;

            case 2:

                System.out.println("Subtraction of both numbers is "+ (test.sub()));
                break;

            case 3:

                System.out.println("Multiplication of both numbers is "+ test.multiply());
                break;

            case 4:

                System.out.println("Division of both numbers is "+ test.divide());
                break;

            case 5:

                System.out.println("Modulus of both numbers is "+ test.modulus());
                break;

            case 6:
                break;

            default:
                System.out.println(test.defaultt());
        }



    }
}
