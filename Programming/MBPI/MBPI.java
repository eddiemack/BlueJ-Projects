/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class MBPI
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int answer1, answer2, answer3, answer4;
        String letter1, letter2, letter3, letter4;
        System.out.println ("This program is based on the Myers-Briggs Type Indicator.");
        System.out.println ("Do you prefer to focus on 1) people and things, or 2) ideas and images?");
        answer1 = keyboard.nextInt ();
        if (answer1 == 1)
        {
            letter1 = "E";
        }
        else
        {
            letter1 = "I";
        }
        System.out.println ("Do you pay more attention to information that are 1) facts and hands-on experience, or 2) ideas and impressions?");
        answer2 = keyboard.nextInt ();
        if (answer2 == 1)
        {
            letter2 = "S";
        }
        else
        {
            letter2 = "N";
        }
        System.out.println ("When you make a decision, do you prefer 1) to decide on the basis of logic, principles, and facts, or 2) using personal concerns and the people involved?");
        answer3 = keyboard.nextInt ();
        if (answer3 == 1)
        {
            letter3 = "T";
        }
        else
        {
            letter3 = "F";
        }
        System.out.println ("Do you prefer that 1) your life be planned, stable, and organized, or 2) prefer to go with the flow and respond to things that arise?");
        answer4 = keyboard.nextInt ();
        if (answer4 == 1)
        {
            letter4 = "J";
        }
        else
        {
            letter4 = "P";
        }
        System.out.println ("Your personality type is " + letter1 + letter2 + letter3 + letter4 + ".");
        System.out.println ("Google your personality to find out more.");
    }
}