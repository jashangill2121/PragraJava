package Assignments;

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = scanner.next();
        name = name.toLowerCase();

        int countVowels = 0;
        int countConsonants = 0;

        char [] enteredName = name.toCharArray();

            for (int j = 0; j < enteredName.length; j++) {
                if (enteredName[j] == 'a' || enteredName[j] == 'e'|| enteredName[j] == 'i'|| enteredName[j] == 'o'|| enteredName[j] == 'u'){
                    countVowels++;
                }
        else {
                    countConsonants++;
                }
            }

        System.out.println("Total vowels in the entered name are " +countVowels);
        System.out.println("Total consonants in the entered name are " +countConsonants);
    }

}
