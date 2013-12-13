/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class QandA
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String room, homework, condition, school, gayMarriage, repub, demo;
        System.out.println ("--Questions and Answers--");
        System.out.println ("Is your room clean?");
        room = keyboard.next ();
        if (room.equalsIgnoreCase ("Yes"))
        {
            System.out.println ("Good.");
            System.out.println ("Is your homework done?");
            homework = keyboard.next ();
            if (homework.equalsIgnoreCase ("Yes"))
            {
                System.out.println ("Go out to the movies.");
            }
            else
            {
                System.out.println ("Do your homework.");
            }
        }
        else
        {
            System.out.println ("Clean your room.");
        }
        System.out.println ("How are you today?");
        condition = keyboard.next ();
        if (condition.equalsIgnoreCase ("Good"))
        {
            System.out.println ("Great!");
        }
        else
        {
            System.out.println ("Is it because of something at school?");
            school = keyboard.next ();
            if (school.equalsIgnoreCase ("Yes"))
            {
                System.out.println ("Sorry to hear that.");
            }
            else
            {
                System.out.println ("Didn't mean to be nosey.");
            }
        }
        System.out.println ("Do you support or oppose gay marriage?");
        gayMarriage = keyboard.next ();
        if (gayMarriage.equalsIgnoreCase ("Oppose"))
        {
            System.out.println ("Are you a Republican?");
            repub = keyboard.next ();
            if (repub.equalsIgnoreCase ("yes"))
            {
                System.out.println ("Good guess on my part.");
            }
            else
            {
                System.out.println ("Bad guess on my part.");
            }
        }
        else
        {
            System.out.println ("Are you a Democrat?");
            demo = keyboard.next ();
            if (demo.equalsIgnoreCase ("Support"))
            {
                System.out.println ("Good guess on my part.");
            }
            else
            {
                System.out.println ("Bad guess on my part.");
            }
        }
            
    }
}
        