package Assignments;

public class BankAccount {

                String accountNumber ;
                String accountHolderName ;
                double balance ;
                static int numberOfAccounts = 0;


       public BankAccount(){

       }

       public BankAccount (String accountNumber, String accountHolderName, double balance){

                this.accountNumber = accountNumber;
                this.accountHolderName = accountHolderName;
                this.balance = balance;
                numberOfAccounts++;

          }

       public static int countAccount(){

                  return numberOfAccounts;

       }

       public void deposit( double amount){

           balance += amount;

       }

       public void withdraw( double amount) {

           if (balance>=amount) {

               balance -= amount;
           }

           else {
                   System.out.println("Insufficient funds");

               }

       }

       public void checkBalance(double balance){

           if (balance <= 0){

               System.out.println("Your balance is 0 ");

           }

           else {

               System.out.println("Your balance is " + balance);

           }

       }

       public static void main(String[] args) {

           BankAccount bankAccount = new BankAccount();
           BankAccount bankAccount1 = new BankAccount("45215", "Aman", 500.0);
           BankAccount bankAccount2 = new BankAccount("41215","Jashan",1000);
           BankAccount bankAccount3 = new BankAccount("46587","Raman",569.44);

           System.out.println( "Total accounts created are " + BankAccount.countAccount());

           bankAccount1.deposit(500);
           bankAccount1.withdraw(200);
           bankAccount3.checkBalance(bankAccount1.balance);



    }
}
