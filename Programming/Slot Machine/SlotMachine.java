/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements: Thanks to Lucas Perez.
 * Eddie Mack
 */
import java.util.*;
public class SlotMachine
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int tokens, pull, afterTokens, wheel1, wheel2, wheel3;
        String answer;
        tokens = 100;
        System.out.println ("--Slot Machine--");
        System.out.println ("Welcome to Slot Machine! You have 100 tokens. Each pull costs 1 token. Would you like to play? (Y for yes, N for no)");
        answer = keyboard.next ();
        while (answer.equalsIgnoreCase ("Y"))
        {
            tokens = tokens - 1;
            wheel1 = (int) (Math.random () * 3) + 1;
            wheel2 = (int) (Math.random () * 3) + 1;
            wheel3 = (int) (Math.random () * 3) + 1;
            if (wheel1 == 1 && wheel2 == 1 && wheel3 == 1)
            {
                tokens = tokens + 4;
                System.out.println ("[" + wheel1 + "]" + "[" + wheel2 + "]" + "[" + wheel3 + "] You win 4 tokens!!!! You now have " + tokens + " tokens!");
            }
            else if (wheel1 == 2 && wheel2 == 2 && wheel3 == 2)
            {
                tokens = tokens + 8;
                System.out.println ("You win 8 tokens!!!! You now have " + tokens + " tokens!");
            }
            else if (wheel1 == 3 && wheel2 == 3 && wheel3 == 3)
            {
                tokens = tokens + 12;
                System.out.println ("You win 12 tokens!!!! You now have " + tokens + " tokens!");
            }
            else
            {
                System.out.println ("You lose! You now have " + tokens + " tokens!");
            }
            System.out.println ("Would you like to play again? You have " + tokens + " tokens.");
            answer = keyboard.next ();
        }
        if (answer.equalsIgnoreCase ("N"));
        {
            System.out.println ("Thanks for playing! You ended with " + tokens + " tokens!");
        }
     }
}