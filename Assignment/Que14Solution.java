import java.util.Scanner;

class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN; // Returning NaN (Not a Number) for divide-by-zero scenario
        }
    }
}


class Main{
    public static void main(String []args){
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Enter operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result = 0;

        switch (operation) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

        System.out.println("Result: " + result);

        scanner.close();
        
    }
}