/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements: John Chung
 * Eddie Mack
 */
import java.util.*;
public class ForeignExchange
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double dollar, kronor, dong, ngultrum, lei;
        int number;
        System.out.println ("How many US $ would you like to exchange?");
        dollar = keyboard.nextInt ();
        System.out.println ("What would you like to exchange into?");
        System.out.println ("1) Swedish Kronor");
        System.out.println ("2) Vietnamese Dong");
        System.out.println ("3) Bhutanese Ngultrum");
        System.out.println ("4) Romanian Lei");
        number = keyboard.nextInt ();
        lei = dollar * 3.5688;
        ngultrum = dollar * 54.9448;
        dong = dollar * 20850;
        kronor = dollar * 6.7779;
        switch (number)
        {
            case 1:
                  System.out.println ("10 USD = " + kronor + " Swedish Kronor as of November 14th, 2012.");
                  break;
            case 2:
                  System.out.println ("10 USD = " + dong + " Vietnamese Dong as of November 14th, 2012.");
                  break;
            case 3:
                  System.out.println ("10 USD = " + ngultrum + " Bhutanese Ngultrum as of November 14th, 2012.");
                  break;
            default:
                  System.out.println ("10 USD = " + lei + " Romanian Lei as of November 14th, 2012.");
        }
    }
}