/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements: Thanks to Cam Stine for reminding me about Scanner.
 * Eddie Mack
 */
import java.util.*;
public class LeapYear
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int year;
        System.out.println ("Enter a year.");
        year = keyboard.nextInt ();
        if (year % 4 != 0)
        {
            System.out.println (year + " is a leap year.");
        }
        else if (year % 400 == 0)
        {
            System.out.println (year + " is a leap year.");
        }
        else if (year % 100 == 0)
        {
            System.out.println (year + " is not a leap year.");
        }
        else if (year % 100 != 0)
        {
            System.out.println (year + " is a leap year.");
        }
    }
}