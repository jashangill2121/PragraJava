package may28;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number for which you want the table");
        int table = obj.nextInt();
        System.out.println("Enter the number till you want to see the table");
        int limit = obj.nextInt();
        int i;
        for (i = 1; i <= limit; i++) {
            int multiple = table * i;
            System.out.println(table + " * " + i + "= " + multiple);

        }
    }
}
