/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class Fahrenheit
{
    public static void main  (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double fahrenheit, celcius;
        System.out.println ("Enter a temperature, in fahrenheit.");
        fahrenheit = keyboard.nextDouble ();
        celcius = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.println ("Your temperature in Celcius is " + celcius);
    }
}