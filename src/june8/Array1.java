package june8;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        int [][]arr1 = new int [3][3];
        int [][]arr2 = new int [3][3];
        int [][]arr3 = new int [3][3];

       arr1[0][0]=10;
       arr1[0][1]=155;
       arr1[0][2]=15;
       arr1[1][0]=10;
       arr1[1][1]=1;
       arr1[1][2]=12;
       arr1[2][0]=10;
       arr1[2][1]=10;
       arr1[2][2]=10;

        arr2[0][0]=10;
        arr2[0][1]=155;
        arr2[0][2]=15;
        arr2[1][0]=10;
        arr2[1][1]=144;
        arr2[1][2]=128;
        arr2[2][0]=1056;
        arr2[2][1]=102;
        arr2[2][2]=150;

        arr3[0][0]=arr1[0][0]+arr2[0][0];
        arr3[0][1]=arr1[0][1]+arr2[0][1];
        arr3[0][2]=arr1[0][2]+arr2[0][2];
        arr3[1][0]=arr1[1][0]+arr2[1][0];
        arr3[1][1]=arr1[1][1]+arr2[1][1];
        arr3[1][2]=arr1[1][2]+arr2[1][2];
        arr3[2][0]=arr1[2][0]+arr2[2][0];
        arr3[2][1]=arr1[2][1]+arr2[2][1];
        arr3[2][2]=arr1[2][2]+arr2[2][2];

        System.out.println(arr3[2][0]);



    }

}
