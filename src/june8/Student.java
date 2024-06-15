package june8;

import java.util.Scanner;


public class Student{
    public static void main(String[] args) {

        String[] name = new String[7];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the students");

        for (int i = 0; i < name.length; i++) {
            name[i]= scanner.next();
        }

        for (int i = 0; i < name.length; i++) {

            System.out.println("Name of " + name[i]);
        }
    }



}
