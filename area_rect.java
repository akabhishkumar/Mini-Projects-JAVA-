
import java.util.Scanner;

public class area_rect {
    public static void main(String[]args){
        double width =0.;
        double height=0;
        double area=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the width: ");
        width = sc.nextDouble();
        System.out.print("enter the height: ");
        height = sc.nextDouble();
        area= width*height;
        System.out.println("the area of the ractangle is: "+ area);
        sc.close();
    }
    
}
