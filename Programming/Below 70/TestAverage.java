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
        int testScore, numOfTestScores, sumOfTestScores, numOfScoresBelow70, sumOfScoresBelow70;
        double percentBelow70;
        System.out.println ("--Test Average Calculator--");
        System.out.println ("Enter a test score: (-1 to quit)");
        testScore = keyboard.nextInt ();
        sumOfScoresBelow70 = 0;
        numOfScoresBelow70 = 0;
        numOfTestScores = 0;
        sumOfTestScores = 0;
        while (testScore<= 70)
        {
            numOfScoresBelow70 = numOfScoresBelow70 + 1;
            numOfTestScores = numOfTestScores + 1;
            sumOfScoresBelow70 = testScore + sumOfScoresBelow70;
            System.out.println ("Enter a test score: (-1 to quit)");
            testScore = keyboard.nextInt ();
        }
        while (testScore != -1)
        {
            numOfTestScores = numOfTestScores + 1;
            sumOfTestScores = testScore + sumOfTestScores;
            System.out.println ("Enter a test score: (-1 to quit)");
            testScore = keyboard.nextInt ();
        }
        if (numOfTestScores != 0)
        {
            percentBelow70 = ((double) numOfScoresBelow70 / numOfTestScores) * 100;
            System.out.println ("Percentage below 70: " + percentBelow70 +"%.");
        }
    }
}