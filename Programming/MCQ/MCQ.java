/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class MCQ
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int answer1, answer2;
        System.out.println ("What happened at Pearl Harbor on December 7th, 1941?");
        System.out.println ("1) Japanese forces bombed a US naval base");
        System.out.println ("2) The Atlantic Charter was signed by Winston S. Churchill and Franklin D. Roosevelt");
        System.out.println ("3) The first atomic bomb was completed");
        System.out.println ("3) The US fleet set sail to recapture the Philippines from the Japanese");
        answer1 = keyboard.nextInt ();
        while (answer1 != 1)
        {
            System.out.println ("You are not correct. Try again.");
            answer1 = keyboard.nextInt ();
        }
        if (answer1 == 1)
        {
            System.out.println ("Correct.");
            System.out.println ("What are the first 4 digits of pi?");
            System.out.println ("1) 2.143");
            System.out.println ("2) 3.141");
            System.out.println ("3) 1.224");
            System.out.println ("4) 4.212");
            answer2 = keyboard.nextInt ();
            while (answer2 != 2)
            {
                System.out.println ("You are not correct. Try again.");
                answer2 = keyboard.nextInt ();
            }
            if (answer2 == 2)
            {
                System.out.println ("Correct.");
            }
        }
    }
}