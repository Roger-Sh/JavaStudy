package helloworld;

/*
    1. generate a random number from range [a, b]
    2. use Binary search algorithm to guess the number
 */

import javax.swing.plaf.IconUIResource;
import java.util.Random;
import java.util.Scanner;

public class Demo15_3API_RandomGuessNumber {
    public static void main(String[] args) {
        // use Scanner to get range [a, b]
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        while (true) {
            System.out.println("Please enter the low bound for range [A, B]: ");
            a = sc.nextInt();
            System.out.println("Please enter the low bound for range [A, B]: ");
            b = sc.nextInt();

            if (a < b) {
                System.out.println("Get range [" + a + ", " + b + "] for random number!");
                break;
            } else {
                System.out.println("Wrong rang, please enter another range!");
                System.out.println("===============================");
            }
        }

        // generate a random number use range [a, b]
        Random r = new Random();
        int randomNumber = r.nextInt(b - a + 1) + a;

        // init for guess
        boolean isRight = false;
        int guessNumber = (a + b) / 2;
        int bound_low = a;
        int bound_high = b;

        // use binary search algorithm to guess the random number
        int i = 0;
        do {
            System.out.println(i + "-th iteration.");

            if (guessNumber == randomNumber) {
                isRight = true;
                System.out.println("RandomNumber is " + randomNumber);
                System.out.println("GuessNumber is " + guessNumber);
                System.out.println("Guess right!");
                System.out.println("===============================");

            } else if (guessNumber < randomNumber) {
                System.out.println("GuessNumber " + guessNumber + " is too small!");
                bound_low = guessNumber;
                guessNumber = (bound_high + bound_low) / 2;
                System.out.println("GuessNumber is updated to " + guessNumber + "!");
                System.out.println("===============================");

            } else {    // guessNumber > randomNumber
                System.out.println("GuessNumber " + guessNumber + " is too big!");
                bound_high = guessNumber;
                guessNumber = (bound_high + bound_low) / 2;
                System.out.println("GuessNumber is updated to " + guessNumber + "!");
                System.out.println("===============================");

            }
            i++;
        } while (!isRight);
    }
}
