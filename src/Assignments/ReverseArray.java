package Assignments;

public class ReverseArray {

    public static void main(String[] args) {


        int[] number = {10, 30, 43, 54, 23, 543, 43, 32};

        int length = number.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = number[i];
            number[i] = number[length - i - 1];
            number[length - i - 1] = temp;

            System.out.println(number);
        }



    }
}
