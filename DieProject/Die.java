
/**
 * Die allows the user to input a number of sides on a die, and then how many times the user would like to roll the die, then will roll the die (with the number of sides that the user input) the amount of times the user told it to.
 * 
 * @author Eddie Mack
 * @version 11/3/13
 */
public class Die
{
    private int numDieSides;
    public Die (int numSides)
    {
        numDieSides = numSides;
    }
    
    public double getRoll ()
    {
        return ((int)(Math.random() * 6) + 1);
    }
}