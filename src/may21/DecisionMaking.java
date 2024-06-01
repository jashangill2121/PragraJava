package may21;

import java.util.Scanner;

public class DecisionMaking {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        double num=scanner.nextInt();
         double result=num%2;
        if(result==0){
            System.out.println("Number is even");

        }
        else {
            System.out.println("Number is negative");
        }
    }
}