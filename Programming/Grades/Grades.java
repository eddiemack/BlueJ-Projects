/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class Grades
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int numOfFails, numOfPasses, fails, passes, percentPass, percentFail, numOfGrades;
        String grade, f;
        System.out.println ("--Grades Program--");
        System.out.println ("Enter a grade:");
        grade = keyboard.next ();
        fails = 0;
        passes = 0;
        numOfGrades = 0;
        while (!grade.equalsIgnoreCase ("Z"))
        {
            if (grade.equalsIgnoreCase ("f"))
            {
                fails = fails + 1;
                numOfGrades = numOfGrades + 1;
            }
            if (!grade.equalsIgnoreCase ("f"))
            {
                passes = passes + 1;
                numOfGrades = numOfGrades + 1;
            }
            
            System.out.println ("Enter a grade:");
            grade = keyboard.next ();
        }
        if (grade.equalsIgnoreCase ("Z"))
        {
            numOfGrades = fails + passes;
            percentPass = (passes / numOfGrades) * 100;
            System.out.println (passes + " students passed: " + percentPass + "%");
        }
    }
}