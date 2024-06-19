package june15;

public class Test {

    public static void main(String[] args) {


        String st = "5455454";
        boolean matches = st.matches("^[0-9]*$");   // checks if the string has only numbers from 0-9 , + means if the numbers are repeating
        System.out.println(matches);


    }
}
