package Assignments;

public class Book {

            String title ;
            String author;
            double price ;
            int quantity ;


    public Book() {

    }


    public Book (String title, String author, double price, int quantity) {

            this.title = title;
            this.author = author;
            this.price = price;
            this.quantity = quantity;

     }



    public static void totalPrice(){

             Book checkPrice = new Book("AsYouLikeIt","Shakespeare",50,10);

             double totPrice = checkPrice.quantity * checkPrice.price;
             System.out.println ("Total price of " + checkPrice.quantity + " books is $" + totPrice);

         }


    public void printDetails(){

             System.out.println("Total price of " + quantity + " " + title + " books written by " + author + " is $" + quantity*price);

         }


    public static void main(String[] args) {

             Book.totalPrice();

             Book book1 = new Book();
             Book book2 = new Book("Fable","Young",100.0,5);
             Book book3 = new Book("Mockinjay","Collins",45,9);
             Book book4 = new Book("WinterSong","Jones",30,4);

             book1.printDetails();
             book2.printDetails();
             book3.printDetails();book4.printDetails();

    }

}
