import java.util.Scanner;
import java.util.Random;
public class TASK1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int playAgain = 1;
        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain == 1) 
        {
            int number = rand.nextInt(100) + 1; // Random number 1-100
            int attempts = 0;
            int maxAttempts = 10;
            System.out.println("\nI have chosen a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) 
            {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;
                if (guess == number) 
                {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    break;
                } 
                else if (guess < number) 
                {
                    System.out.println("Too low!");
                } 
                else 
                {
                    System.out.println("Too high!");
                }
            }
            System.out.print("Do you want to play again? (1 = Yes, 0 = No): ");
            playAgain = sc.nextInt();
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
