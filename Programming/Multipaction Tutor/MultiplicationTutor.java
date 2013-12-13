/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements: Matthew Hogan
 * Eddie Mack
 */
import java.util.*;
public class MultiplicationTutor
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int number1, number2, counter, answer, total, numWrong, numRight, numTotal;
        double percentage;
        System.out.println ("--Multiplication Tutor--");
        numRight = 0;
        numWrong = 0;
        numTotal = 0;
        for (counter = 1; counter<= 10; counter = counter + 1)
        {
            number1 = (int) (Math.random () * 12) + 1;
            number2 = (int) (Math.random () * 12) + 1;
            total = number1 * number2;
            System.out.println (counter + ") " + number1 + " * " + number2 + " = ");
            answer = keyboard.nextInt ();
            numTotal = numTotal + 1;
            if (answer == number1 * number2)
            {
                System.out.println ("Correct!");
                numRight = numRight + 1;
            }
            else
            {
                System.out.println ("Wrong. It's " + total + ".");
                numWrong = numWrong + 1;
            }
            percentage = (double) numRight / numTotal * 100;
            if (counter == 10)
            {
                System.out.println ("Percentage correct = " + percentage + "%.");
            }
        }
    }
}