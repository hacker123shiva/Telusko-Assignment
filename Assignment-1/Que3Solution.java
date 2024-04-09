package Assignment_1;

import java.util.*;

public class Que3Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculation of Simple Interest");

        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        // Input interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = sc.nextDouble();

        // Input time period
        System.out.print("Enter the time period (in years): ");
        double time = sc.nextDouble();

        // Calculate simple interest
        double SI = (principal * rate * time) / 100;

        // Display the simple interest
        System.out.println("Simple Interest is: " + SI);

        sc.close();
    }
}
