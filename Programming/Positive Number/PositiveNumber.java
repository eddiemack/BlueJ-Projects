/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknlowledgement:
 * Eddie Mack
 */
import java.util.*;
public class PositiveNumber
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int number;
        System.out.println ("Enter a positive number.");
        number = keyboard.nextInt ();
        while (number <= 0)
        {
            System.out.println ("Oops! Try again.");
            System.out.println ("Please enter a positive number:");
            number = keyboard.nextInt ();
        }
        System.out.println ("Thanks!");
    }
}