package may25;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {

        Scanner grade= new Scanner(System.in);

        System.out.println("Enter your score");
        double score=grade.nextDouble();

        if(score>=90 && score<=100) {
            System.out.println("Student got grade A");
        }
        else if(score>=80 && score<=89) {
            System.out.println("Student got grade B");
        }

        else if(score>=70 && score<=79) {
            System.out.println("Student got grade C");
        }

        else if(score>=60 && score<=69) {
            System.out.println("Student got grade D");
        }

        else {
            System.out.println("Student got grade F");
        }


}
    }

