import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < minRange || userGuess > maxRange) {
                System.out.println("Please enter a number within the specified range.");
            } else if (userGuess < targetNumber) {
                System.out.println("The target number is higher. Try again.");
            } else if (userGuess > targetNumber) {
                System.out.println("The target number is lower. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
