/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgments:
 * Eddie Mack
 */
import java.util.*;
public class Magic8Ball
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String question;
        int answer;
        System.out.println ("What's on your mind, friend?");
        question = keyboard.nextLine ();
        answer = (int) (Math.random () * 8) + 1;
        if (answer == 1)
        {
            System.out.println ("The answer to the question you are looking for is yes.");
        }
        else if (answer == 2)
        {
            System.out.println ("Yes.");
        }
        else if (answer == 3)
        {
            System.out.println ("Quite possibly.");
        }
        if (answer == 4)
        {
            System.out.println ("The answer to the question you are looking for is no.");
        }
        else if (answer == 5)
        {
            System.out.println ("Nope.");
        }
        else if (answer == 6)
        {
            System.out.println ("Not quite.");
        }
        if (answer == 7)
        {
            System.out.println ("The answer to the question you are looking for is maybe.");
        }
        else if (answer == 8)
        {
            System.out.println ("It may or may not be so.");
        }
    }
}