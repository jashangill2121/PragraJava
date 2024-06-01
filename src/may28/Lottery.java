package may28;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        Scanner lottery=new Scanner(System.in);
        System.out.println("Enter a number");
        int lucky=lottery.nextInt();
        int i;

        for (i=1;i<=100;i++){

            if(lucky==55) {
                System.out.println("You are the lucky winner");
                break;
            }
            else{
                System.out.println("Please try again");
                break;
            }

        }



    }
}
