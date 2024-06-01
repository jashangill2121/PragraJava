package may25;

import java.util.Scanner;

public class IVRDemo {
    public static void main(String[] args) {


            System.out.println("***************");
            System.out.println("Welcome to Telecommunication ");
            System.out.println("***************");

            System.out.println("Press 1 English");
            System.out.println("Press 2 for French");
            System.out.println("Press Y to repeat the menu");
            System.out.println("Press Q for to exit");

            Scanner input = new Scanner(System.in);
            String press = input.next();

            switch (press) {

                case ("1"):

                    System.out.println("Press 1 Billing");
                    System.out.println("Press 2 for Cancellation");
                    System.out.println("Press 3 for Tech support");
                    System.out.println("Press Y to repeat the menu");
                    System.out.println("Press Q for to exit");

                {
                    String moreChoice = input.next();
                    if (moreChoice == "1") {
                        System.out.println("You have reached billing");
                        System.out.println("Press 1 to talk to an agent");
                        System.out.println("Press 2 to receive a call back");
                        System.out.println("Press Y to repeat the menu");
                        System.out.println("Press Q for to exit");
                        String choice1 = input.next();
                        {
                            switch (choice1) {

                                case ("1"):
                                    System.out.println("You are being connected to an agent over call");
                                    break;

                                case ("2"):
                                    System.out.println("Please enter your phone number");
                                    String number = input.next();
                                    System.out.println("You will receive a call back at " + number + " in few minutes");

                            }
                        }

                    } else if (moreChoice == "2") {
                        System.out.println("You have reached Cancellation department");
                        System.out.println("Press 1 to talk to an agent");
                        System.out.println("Press 2 to receive a call back");
                        System.out.println("Press Y to repeat the menu");
                        System.out.println("Press Q for to exit");
                        String choice2 = input.next();
                        {
                            switch (choice2) {

                                case ("1"):
                                    System.out.println("You are being connected to an agent over call");
                                    break;

                                case ("2"):
                                    System.out.println("Please enter your phone number");
                                    String number = input.next();

                                    System.out.println("You will receive a call back at " + number + " in few minutes");

                            }
                        }

                    } else if (moreChoice == "3") {
                        System.out.println("You have reached Tech support");
                        System.out.println("Press 1 to talk to an agent");
                        System.out.println("Press 2 to receive a call back");
                        System.out.println("Press Y to repeat the menu");
                        System.out.println("Press Q for to exit");

                        String choice3 = input.next();
                        {
                            switch (choice3) {

                                case ("1"):
                                    System.out.println("You are being connected to an agent over call");
                                    break;

                                case ("2"):
                                    System.out.println("Please enter your phone number");
                                    String number = input.next();
                                    System.out.println("You will receive a call back at " + number + " in few minutes");

                            }
                        }

                    } else {
                        System.out.println("You have chosen a wrong input");
                    }
                    break;
                }

                case ("2"):

                    System.out.println("Appuyez sur 1 Facturation");
                    System.out.println("Appuyez sur 2 pour annuler");
                    System.out.println("Appuyez sur 3 pour le support technique");
                    System.out.println("Appuyez sur 4 pour parler à un agent");

                    break;

                case ("Y"):
                    System.out.println("Press 1 English");
                    System.out.println("Press 2 for French");
                    System.out.println("Press Y to repeat the menu");
                    System.out.println("Press Q for to exit");

                    break;


            }

            System.out.println("Press Y to repeat the menu");
            System.out.println("Press Q for to exit");
            Scanner input1 = new Scanner(System.in);


        }




    }

