package Assignments;

public class Palindrome {

    public static void main(String[] args) {

        String palindrome1 = "madam";
        String palindrome2 = "racecar";
        String tempP1 = "";
        int length1 = palindrome1.length();
        for (int i = length1 - 1; i >= 0; i--) {
            tempP1 = tempP1 + palindrome1.charAt(i);
        }
         if(palindrome1.equals(tempP1)){

        System.out.println("This is a palindrome");

    }
         else {

             System.out.println("This is not a palindrome");
         }
}
}

