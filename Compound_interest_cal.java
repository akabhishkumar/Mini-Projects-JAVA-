
import java.util.Scanner;
public class Compound_interest_cal{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded ;
        int years;
        double amount;
        
        System.out.println("enter the principal amount:");
        principal =sc.nextDouble();

        System.out.println("enter the rate of interest");
        rate = sc.nextDouble();
        System.out.println("enter the number of times compouded per year");
        timesCompounded=sc.nextInt();
        System.out.println("enter the number of years ");
        years = sc.nextInt();
        amount= principal*Math.pow(1+ (rate/100)/timesCompounded,timesCompounded*years);
        System.out.printf("the amount after %d years is %.2f", years,amount);

        
        
        sc.close();


    }
} 