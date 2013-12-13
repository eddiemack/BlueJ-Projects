/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowlegements:
 * Eddie Mack
 */
import java.util.*;
public class SecondQuarterTestProgramOne
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int randNum1, randNum2, symbol, pAnswer, aAnswer, percent, numCorrect, total;
        String play;
        total = 0;
        numCorrect = 0;
        System.out.println ("Would you like to play?");
        play = keyboard.next ();
        while (play.equalsIgnoreCase ("yes"))
        {
            total = total + 1;
            randNum1 = (int) (Math.random () * 20);
            randNum2 = (int) (Math.random () * 20);
            symbol = (int) (Math.random () * 3);
            if (symbol == 0)
            {
                aAnswer = randNum1 + randNum2;
                System.out.println (randNum1 + " + " + randNum2);
                pAnswer = keyboard.nextInt ();
                if (pAnswer == aAnswer)
                {
                    numCorrect = numCorrect + 1;
                    System.out.println ("Correct!");
                    System.out.println ("Would you like to play?");
                    play = keyboard.next ();
                }
            }
            else if (symbol == 1)
            {
                aAnswer = randNum1 - randNum2;
                System.out.println (randNum1 + " - " + randNum2);
                pAnswer = keyboard.nextInt ();
                if (pAnswer == aAnswer)
                {
                    numCorrect = numCorrect + 1;
                    System.out.println ("Correct!");
                }
                System.out.println ("Would you like to play?");
                play = keyboard.next ();
            }
            else if (symbol == 2)
            {
                aAnswer = randNum1 * randNum2;
                System.out.println (randNum1 + " * " + randNum2);
                pAnswer = keyboard.nextInt ();
                if (pAnswer == aAnswer)
                {
                    System.out.println ("Correct!");
                    numCorrect = numCorrect + 1;
                }
                System.out.println ("Would you like to play?");
                play = keyboard.next ();
            }
            else
            {
                aAnswer = randNum1 % randNum2;
                System.out.println (randNum1 + " % " + randNum2);
                pAnswer = keyboard.nextInt ();
                if (pAnswer == aAnswer)
                {
                    System.out.println ("Correct!");
                    numCorrect = numCorrect + 1;
                }
                System.out.println ("Would you like to play?");
                play = keyboard.next ();
            }
            if (play.equalsIgnoreCase ("no"))
            {
                System.out.println ("Thanks for playing!");
                percent = (numCorrect / total) * 100;
                System.out.println ("Your percentage was " + percent + "!");
            }
                
        }
    }
}