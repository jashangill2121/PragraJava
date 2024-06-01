package june1;


import java.util.Scanner;

public class NameInput {



    public  String input(String name) {
        System.out.println("Enter your name");
        System.out.println("Hello"+name);
        return "Hello"+name;
    }


    public  String input(String name, String email) {
        System.out.println("Enter your name");
        System.out.println("Enter your email");
        System.out.println("Hello"+name+ "your email is "+ email );
        return "Hello"+name+email;
    }

    public String input(String name, String email,String password) {
        System.out.println("Enter your name");
        System.out.println("Enter your email");
        System.out.println("Enter your password");
        System.out.println("Hello"+name+ "your email is "+ email + "and your password is " + password );

        return  "Hello"+name+email+password;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name= obj.next();
        String email= obj.next();
        String password=obj.next();

         NameInput obj1=new NameInput();
         obj1.input(name);
        obj1.input(name,email);
        obj1.input(name,email,password);

    }
}
