package Assignment_1;
import java.util.Scanner;

public class Que1Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator Operations!!");
        
        //Calculations can be performed until the user exits
        while (true) {
            // Choose the operation to be performed
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("0. Exit");

            System.out.print("Enter your choice (1/2/3/4/0): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Calculator Closed!!");
                // No input will be taken further
                sc.close();
                return;
            }

            // Input first number
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            // Input second number
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            // Perform operation based on user choice
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } 
                    //Denominator cannot be zero
                    else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            // Display the result after performing calculation
            System.out.println("Result after the performing the calculation: " + result);
            System.out.println();
        }
    }
}
