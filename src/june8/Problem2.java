package june8;

public class Problem2 {

    public static void main(String[] args) {

        int[] arrayOld = {10, 20, 30, 40, 50};
        int[] arrayNew= new int[5];
        for (int i = 0; i< arrayOld.length/2 ; i++) {
            arrayNew[i] = arrayOld[i];
            arrayOld[i] = arrayOld[arrayOld.length - 1- i];
            arrayOld[arrayOld.length - 1 - i] =arrayNew[i];

            System.out.print(arrayNew[i] + ",");
        }

    }
}
