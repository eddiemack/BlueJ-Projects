/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class GPA
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double gpa;
        System.out.println ("What is your GPA?");
        gpa = keyboard.nextDouble ();
        while (gpa <= 0.0 || gpa > 4.0)
        {
            System.out.println ("That's not a valid GPA!");
            System.out.println ("What is your GPA?");
            gpa = keyboard.nextDouble ();
        }
        System.out.println ("Thanks!");
    }
}