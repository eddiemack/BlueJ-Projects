/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements: Thanks to John Chung for helping me with "left over".
 * Eddie Mack
 */
import java.util.*;
public class Volleyball
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int numberPlayers, numberTeams, numberLeft;
        System.out.println ("Enter the number of players:");
        numberPlayers = keyboard.nextInt ();
        numberTeams = numberPlayers / 7;
        numberLeft = numberPlayers % 7;
        System.out.println ("There will be " + numberTeams + " teams with " + numberLeft + " left over.");
    }
}