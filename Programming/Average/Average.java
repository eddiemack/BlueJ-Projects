/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class Average
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double numOne, numTwo, numThree, average;
        System.out.println ("Enter first decimal number:");
        numOne = keyboard.nextDouble ();
        System.out.println ("Enter second decimal number:");
        numTwo = keyboard.nextDouble ();
        System.out.println ("Enter third decimal number:");
        numThree = keyboard.nextDouble ();
        average = (numOne + numTwo + numThree) / 3;
        System.out.println ("The average of your three numbers is " + average);
    }
}