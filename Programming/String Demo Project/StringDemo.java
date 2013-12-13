/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgments:
 * Eddie Mack
 */
import java.util.*;
public class StringDemo
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String firstName;
        System.out.println ("First name?");
        firstName = keyboard.next ();
        System.out.println ("Hi " + firstName + "!");
        if (firstName.equalsIgnoreCase ("Eddie"))
        {
            System.out.println ("What an awesome name!!!!!");
        }
        if (firstName.equalsIgnoreCase ("Edward"))
        {
            System.out.println ("That's a terrible name!!!");
        }
    }
}