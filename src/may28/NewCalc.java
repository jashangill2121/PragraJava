package may28;

import java.util.Scanner;

public class NewCalc {
    public static void main(String[] args) {


    }
            Scanner input1 = new Scanner(System.in);


                public int add () {

                    System.out.println("Enter 1st number");
                    int add1 = input1.nextInt();
                    System.out.println("Enter 2nd number");
                    int add2 = input1.nextInt();

                    return add1 + add2;

                    }


                public  int sub() {


                    System.out.println("Enter 1st number");
                    int sub1 = input1.nextInt();
                    System.out.println("Enter 2nd number");
                    int sub2 = input1.nextInt();

                    return sub1 - sub2;

                    }


                public  int multiply () {

                    System.out.println("Enter 1st number");
                    int mul1 = input1.nextInt();
                    System.out.println("Enter 2nd number");
                    int mul2 = input1.nextInt();

                    return mul1*mul2;

                    }

                public  double divide() {

                    System.out.println("Enter 1st number");
                    double div1 = input1.nextDouble();
                    System.out.println("Enter 2nd number");
                    double div2 = input1.nextDouble();

                    return div1/div2;

                    }

                public  int modulus() {

                    System.out.println("Enter 1st number");
                    int mod1 = input1.nextInt();
                    System.out.println("Enter 2nd number");
                    int mod2 = input1.nextInt();

                    return mod1%mod2;

                    }

                 public  String defaultt() {

                   return " Wrong input1 Enter number from 1 to 6";

                    }


    }


