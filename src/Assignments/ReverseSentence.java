package Assignments;

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.next();
        String temp = " ";

        String [] split = name.split(" ");

        for (int i = 0; i < split.length; i++) {

            temp = split[i] + " " + temp;
        }

        System.out.println(temp);

    }
}
