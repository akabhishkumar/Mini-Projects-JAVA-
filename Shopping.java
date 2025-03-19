import java.util.Scanner;

public class Shopping{
   public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    double total;
    String currency = "Rs";

    System.out.println("What item are you going to purchase ??");
    item =sc.nextLine();
    System.out.println("What is the price of each ??");
    price=sc.nextDouble();
    System.out.println("How many of them are you buying ??");
    quantity=sc.nextInt();
    total = quantity*price;
    System.out.println("You have bought "+ quantity + " number of "+ item +"/s");
    System.out.println("Your total amount is " +currency+" " +total);
   
    sc.close();


   }
}
