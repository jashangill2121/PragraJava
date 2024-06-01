package may25;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number for which you want the table");
        int table=obj.nextInt();
        int i=1;
        System.out.println("Enter the number till you want to see the table");
        int limit=obj.nextInt();

        while ( i<= limit) {
            int multiple=table*i;
            System.out.println(table+ " * " + i + "= " + multiple);
            i++;


            }
        }
    }
