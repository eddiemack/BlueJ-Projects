/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class MadLibs
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String friend, color, animal, food;
        System.out.println ("Enter the name of a friend.");
        friend = keyboard.next ();
        System.out.println ("Enter an color.");
        color = keyboard.next ();
        System.out.println ("Enter an animal.");
        animal = keyboard.next ();
        System.out.println ("Enter a food.");
        food = keyboard.next ();
        System.out.println ("I had a dream that " + friend + " ate a " + color + " " + animal + " and said it tasted like " + food + "!");
    }
}