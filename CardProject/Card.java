/**
 * Write a description of class Card here.
 * 
 * @author Eddie Mack 
 * @version 12/5/13
 */
public class Card
{
    public String numberString;
    public String suitString;
    public String cardString;
    public Card (String cardString)
    {
        cardString.length();
        if (cardString.length() == 2)
        {
            numberString = cardString.substring (0, 1);
            suitString = cardString.substring (1, 2);
        }
        else if (cardString.length() == 3)
        {
            numberString = cardString.substring (0, 2);
            suitString = cardString.substring (2, 3);
        }
        if (numberString.equals ("A"))
        {
            numberString = "Ace";
        }
        else if (numberString.equals ("2"))
        {
            numberString = "Two";
        }
        else if (numberString.equals ("3"))
        {
            numberString = "Three";
        }
        else if (numberString.equals ("4"))
        {
            numberString = "Four";
        }
        else if (numberString.equals ("5"))
        {
            numberString = "Five";
        }
        else if (numberString.equals ("6"))
        {
            numberString = "Six";
        }
        else if (numberString.equals ("7"))
        {
            numberString = "Seven";
        }
        else if (numberString.equals ("8"))
        {
            numberString = "Eight";
        }
        else if (numberString.equals ("9"))
        {
            numberString = "Nine";
        }
        else if (numberString.equals ("10"))
        {
            numberString = "Ten";
        }
        else if (numberString.equals ("J"))
        {
            numberString = "Jack";
        }
        else if (numberString.equals ("Q"))
        {
            numberString = "Queen";
        }
        else if (numberString. equals ("K"))
        {
            numberString = "King";
        }
        if (suitString.equals ("H"))
        {
            suitString = "Hearts";
        }
        else if (suitString.equals ("S"))
        {
            suitString = "Spades";
        }
        else if (suitString.equals ("C"))
        {
            suitString = "Clubs";
        }
        else if (suitString.equals ("D"))
        {
            suitString = "Diamonds";
        }
        else
        {
            suitString = "unknown";
            numberString = "unknown";
        }
    }
    
    public String getDescription ()
    {
        if (numberString == "unknown")
        {
            return ("unknown");
        }
        else if (suitString == "unknown")
        {
            return ("unknown");
        }
        return (numberString + " of " + suitString);
    }
}