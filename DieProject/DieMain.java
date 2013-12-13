import java.util.*;

public class DieMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int numOfDieSides, numRolls, numRolled;
        numRolled = 0;
        System.out.println ("Enter a number of sides for the die.");
        numOfDieSides = keyboard.nextInt();
        Die dd = new Die (numOfDieSides);
        System.out.println ("How many times would you like to roll your " + numOfDieSides + " sided die?");
        numRolls = keyboard.nextInt();
        while (numRolled < numRolls)
        {
            System.out.println (dd.getRoll());
            numRolled = numRolled + 1;
        }
    }
}