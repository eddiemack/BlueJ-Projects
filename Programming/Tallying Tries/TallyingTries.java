/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class TallyingTries
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int year, tries;
        tries = 1;
        System.out.println ("What year did Japan bomb Pearl Harbor?");
        year = keyboard.nextInt ();
        while (year != 1941)
        {
            System.out.println ("Try again.");
            System.out.println ("What year did Japan bomb Pearl Harbor?");
            year = keyboard.nextInt ();
            tries = tries + 1;
        }
        System.out.println ("It took " + tries + " trie(s) to get the answer right.");
    }
}