/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class SimpleNIM
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int numStones, pStones, cStones;
        System.out.println ("This is the game of NIM! The object of the game is to make the computer take the last stone. The game will start with anywhere between 15 and 30 stones.");
        numStones = (int) (Math.random () * 16) + 15;
        do
        {
            System.out.println ("There are " + numStones + " stones left. How many stones would you like?");
            pStones = keyboard.nextInt ();
            numStones = numStones - pStones;
            cStones = (int) (Math.random () * 3) + 1;
            numStones = numStones - cStones;
            System.out.println ("The computer took " + cStones + " stone(s).");
        }
        while (numStones >= 1);
        System.out.println ("There are no stones left.");
    }
}