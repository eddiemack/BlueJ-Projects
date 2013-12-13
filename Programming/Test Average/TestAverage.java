/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class TestAverage
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int testScore, numOfTestScores, sumOfTestScores;
        double average;
        System.out.println ("--Test Average Calculator--");
        System.out.println ("Enter a test score: (-1 to quit)");
        testScore = keyboard.nextInt ();
        numOfTestScores = 0;
        sumOfTestScores = 0;
        while (testScore != -1)
        {
            numOfTestScores = numOfTestScores + 1;
            sumOfTestScores = testScore + sumOfTestScores;
            System.out.println ("Enter a test score: (-1 to quit)");
            testScore = keyboard.nextInt ();
        }
        if (numOfTestScores != 0)
        {
            average = sumOfTestScores / (double) numOfTestScores;
            System.out.println ("Your average test score is " + average +".");
        }
    }
}