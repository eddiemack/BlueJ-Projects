/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgments:
 * Eddie Mack
 */
import java.util.*;
public class RandomNumbers
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int head;
        head = (int) (Math.random () * 2) + 1;
        if (head == 1)
        {
            System.out.println ("Heads!");
        }
        else
        {
            System.out.println ("Tails!");
        }
    }
}