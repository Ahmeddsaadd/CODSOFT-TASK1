import java.util.Random;
import java.util.Scanner;

public class Task1Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number Game !");

        String answer = new String();
        Random random = new Random();
        int score = 0;

    do {

        System.out.println("What range of numbers you want ?");
        System.out.println("From(inclusive): ");
        int min = input.nextInt();
        System.out.println("To(exclusive): ");
        int max = input.nextInt();

        int number = random.nextInt(max - min) + min;
        System.out.println("You have 5 attempts to guess right.Let us begin !");
        int max_attempts = 0;

        while (max_attempts != 5) {
            System.out.println("Enter your guess from " + min + " to " + max);
            int userGuess = input.nextInt();
            max_attempts++;
            if (number == userGuess) {
                System.out.println("Here you go ! it took you " + max_attempts + " attempt(s) to guess right !");
                score++;
                break;
            } else if (number > userGuess) {
                System.out.println("The random number is greater !");
            } else {
                System.out.println("The random number is lower !");
            }

            if (max_attempts >= 5) {
                System.out.println();
                System.out.println("GAME OVER, TOO MANY ATTEMPTS ! The number was " + number);
            }
        }

        System.out.println("Do you want to play again (yes / no) ?");
        input.nextLine();
        answer = input.nextLine();

    }while(answer.equals("yes"));
        System.out.println("You guessed right " +score +" time(s) while playing this game");
        System.out.println("Thanks for trying ! :)");
    }
}
