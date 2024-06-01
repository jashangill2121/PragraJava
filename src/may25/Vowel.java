package may25;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {


        Scanner alphabet=new Scanner(System.in);

                  char vow1='a';
                  char vow2='e';
                  char vow3='i';
                  char vow4='o';
                  char vow5='u';
                  char test='c';
                  if (test==vow1 || test==vow2 || test==vow3 || test==vow4 || test==vow5){
                      System.out.println("Entered alphabet is a vowel");
                  }
                  else{
                      System.out.println("Entered alphabet is a consonant");
                  }
    }
}
