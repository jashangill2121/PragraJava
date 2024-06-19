package june15;

public class TestBuffer {

    public static void main(String[] args) {

        String st = "Hello World";

        StringBuffer st1 = new StringBuffer("Hello World");

        st.concat("!");    // we cannot change value of original string , immutable

        st1.append("!");     // mutable
        st1.insert(6,"java ") ;
        st1.insert(5,5);


        System.out.println(st);

        st = st.concat("xyz"); // values changed , new object, new string gets created
        System.out.println(st);
        System.out.println(st1);
    }
}
