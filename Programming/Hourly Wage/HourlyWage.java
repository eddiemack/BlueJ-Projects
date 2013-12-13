/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class HourlyWage
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double wage, hours, pay, usualHours, overPay;
        System.out.println ("What is your hourly wage?");
        wage = keyboard.nextInt ();
        System.out.println ("How many hours did you work this week?");
        hours = keyboard.nextInt ();
        usualHours = 40;
        overPay = (wage * 1.5);
        if (hours< 0)
        {
            System.out.println ("Invalid entry.");
        }
        else if (hours> 40)
        {
            pay = (wage * 40) + (hours - 40) * 1.5;
            System.out.println ("You earned $" + pay + " this week.");
        }
        else if (hours< 0 || wage< 0)
        {
            System.out.println ("Invalid input. Please try again.");
            System.out.println ("What is your hourly wage?");
            wage = keyboard.nextInt ();
            System.out.println ("How many hours did you work this week?");
            hours = keyboard.nextInt ();
        }
    }
}