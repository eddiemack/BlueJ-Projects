/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class Compatibility
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String name1, name2;
        int percent;
        System.out.println ("Enter a name.");
        name1 = keyboard.next ();
        System.out.println ("Enter another name.");
        name2 = keyboard.next ();
        percent = (int) (Math.random () * 101);
        System.out.println ("The compatibility between " + name1 + " and " + name2 + " is " + percent + "%.");
    }
}