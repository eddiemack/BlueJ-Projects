/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class RPS
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String pick, computerHand, person;
        int number;
        System.out.println ("Rock, paper, or scissors?");
        person = keyboard.next ();
        number = (int) (Math.random () * 3) + 1;
        if (number == 1)
        {
            computerHand = "rock";
        }
        else if (number == 2)
        {
            computerHand = "paper";
        }
        else
        {
            computerHand = "scissors";
        }
        if (person.equalsIgnoreCase ("paper") && computerHand.equalsIgnoreCase ("rock"))
        {
            System.out.println ("You win!");
        }
        else if (person.equalsIgnoreCase ("rock") && computerHand.equalsIgnoreCase ("paper"))
        {
            System.out.println ("You lose!");
        }
        else if (person.equalsIgnoreCase ("scissors") && computerHand.equalsIgnoreCase ("rock"))
        {
            System.out.println ("You lose!");
        }
        else if (person.equalsIgnoreCase ("scissors") && computerHand.equalsIgnoreCase ("paper"))
        {
            System.out.println ("You win!");
        }
        else if (person.equalsIgnoreCase ("rock") && computerHand.equalsIgnoreCase ("scissors"))
        {
            System.out.println ("You win!");
        }
        else if (person.equalsIgnoreCase ("paper") && computerHand.equalsIgnoreCase ("paper"))
        {
            System.out.println ("It's a tie!");
        }
    }
}