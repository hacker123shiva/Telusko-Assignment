package Assignment_1;

import java.util.*;
public class Que5Solution {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minNum = 1;   
        int maxNum = 100;
        //Generate a random number within a given range
        int targetValue = random.nextInt(maxNum - minNum + 1) + minNum;
        int maxAttempts = 5; // Maximum number of attempts allowed
        int attempts = 0;	// Attempts used by user
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("The maximum number of attempts are 5.");
        System.out.println("Try to Guess a number within the range of 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess number: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == targetValue) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts!");
                break;
            } else if (guess < targetValue) {
                System.out.println("Try again! The actual number is higher.");
            } else {
                System.out.println("Try again! The actual number is lower.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Sorry! The number of attempts are over. The correct number was: " + targetValue);
        }

        sc.close();
	}
}
