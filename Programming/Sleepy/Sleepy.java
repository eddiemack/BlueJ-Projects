/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgments:
 * Eddie Mack
 */
import java.util.*;
public class Sleepy
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String sleepy;
        System.out.println ("Are you sleepy?");
        sleepy = keyboard.next ();
        while (sleepy.equalsIgnoreCase ("yes"))
        {
            System.out.println ("I don't think so...");
            System.out.println ("Are you sleepy?");
            sleepy = keyboard.next ();
        }
        System.out.println ("Thanks!");
    }
}