/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class NumberGame
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int number, guess, tries;
        System.out.println ("--Guessing Game--");
        System.out.println ("Enter a number between 1-100.");
        guess = keyboard.nextInt ();
        number = (int) (Math.random () * 100) + 1;
        tries = 0;
        while (guess != number)
        {
            if (guess < number)
            {
                System.out.println ("Your number is too low. Guess again.");
                System.out.println ("Enter a number between 1-100.");
                guess = keyboard.nextInt ();
            }
            if (guess > number)
            {
                System.out.println ("Your number is too high. Guess again.");
                System.out.println ("Enter a number between 1-100.");
                guess = keyboard.nextInt ();
            }
            if (guess == 0)
            {
                System.out.println ("You quit after " + tries + " tries.");
            }
        if (guess == number)
        {
            System.out.println ("You got it! You accomplished this in " + tries + " tries.");
        }
        tries = tries + 1;
        }
    }
}