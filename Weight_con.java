import java.util.Scanner;

public class Weight_con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Convert Pounds to Kilograms");
        System.out.println("2. Convert Kilograms to Pounds");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in Pounds: ");
            double pounds = sc.nextDouble();
            double kg = pounds * 0.453592;
            System.out.println("Weight in Kilograms: " + kg);
        } else if (choice == 2) {
            System.out.print("Enter weight in Kilograms: ");
            double kg = sc.nextDouble();
            double pounds = kg * 2.20462;
            System.out.println("Weight in Pounds: " + pounds);
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}

