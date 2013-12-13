/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgments:
 * Eddie Mack
 */
import java.util.*;
public class FirstQuarterTest
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String name, heading;
        int randomNumber;
        System.out.println ("Welcome, traveler, to Not Zork! What be thy calling?");
        name = keyboard.next ();
        System.out.println (name + ", which way do you want to head? North, south, east, or west?");
        heading = keyboard.next ();
        randomNumber = (int) (Math.random () * 10) + 1;
        if (heading.equalsIgnoreCase ("east"))
        {
            System.out.println ("You run into a monster with " + randomNumber + " nose(s)!");
        }
        else if (heading.equalsIgnoreCase ("west"))
        {
            System.out.println ("You bump into a dragon with " + randomNumber + " eye(s)!");
        }
        else if (heading.equalsIgnoreCase ("north"))
        {
            System.out.println ("You found an ant with " + randomNumber + " leg(s)!");
        }
        else if (heading.equalsIgnoreCase ("south"))
        {
            System.out.println ("You found a zombie with " + randomNumber + " head(s)!");
        }
        else
        {
            System.out.println ("I don't understand gibberish. Bye.");
        }
    }
}