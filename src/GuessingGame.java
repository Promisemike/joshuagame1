import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        int guess = 0;
        int numTries = 0;

        Scanner scanner = new Scanner(System.in);

        while (guess != randomNumber) {
            System.out.print("Guess a number between 1 and 10: ");
            guess = scanner.nextInt();
            numTries++;

            if (guess < randomNumber) {
                System.out.println("Too low, try again!");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again!");
            }
        }

        System.out.println("Congratulations, you guessed the number in " + numTries + " tries!");

        scanner.close();
    }
}
