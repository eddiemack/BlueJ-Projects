import java.util.*;

public class CardMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String numberString, suitString, cardString;
        System.out.println ("Enter a card notation.");
        cardString = keyboard.next();
        Card casino = new Card (cardString);
        System.out.println ("Your card is a " + casino.getDescription() + ".");
    }
}