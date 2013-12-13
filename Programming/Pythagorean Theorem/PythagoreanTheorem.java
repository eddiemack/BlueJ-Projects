/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class PythagoreanTheorem
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double a, b, pt;
        System.out.println ("Enter a length for side a.");
        a = keyboard.nextDouble ();
        System.out.println ("Enter a length for side b");
        b = keyboard.nextDouble ();
        pt = Math.sqrt (a * a + b * b);
        System.out.println ("The length of the hypotenuse is " + pt);
    }
}