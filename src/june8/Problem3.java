package june8;

import java.util.Scanner;

public class Problem3 {


    public static int showArray() {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] > max)
                max = arr[i];

        }
        return max;
    }


    public static void main(String[] args) {

        System.out.println("Largest element present in given array: " + showArray());


    }
}
