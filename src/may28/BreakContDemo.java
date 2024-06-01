package may28;

public class BreakContDemo {

    public static void main(String[] args) {

        int x;

     for( x=1 ; x<100 ; x++){



         if(x % 2 == 0 && x>20) continue ;
         System.out.println(x);
     }

    }
}
