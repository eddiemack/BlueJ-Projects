/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class FastFood
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int burgers, fries, soda;
        double pBurg, pFries, pSoda, subtotal, taxTotal, taxPercent, taxPrice, taxDivision, amountTendered, change;
        System.out.println ("How many burgers do you want?");
        burgers = keyboard.nextInt ();
        System.out.println ("How many orders of fries do you want?");
        fries = keyboard.nextInt ();
        System.out.println ("How many sodas do you want?");
        soda = keyboard.nextInt ();
        pBurg = burgers * 1.68;
        pFries = fries * 1.09;
        pSoda = soda * 0.99;
        subtotal = pBurg + pFries + pSoda;
        System.out.println ("Your subtotal before tax is $" + subtotal);
        System.out.println ("What is the % tax?");
        taxPercent = keyboard.nextDouble ();
        taxDivision = taxPercent / 100;
        taxTotal = subtotal * taxDivision;
        System.out.println ("The tax is &" + taxTotal);
        taxPrice = subtotal + taxTotal;
        System.out.println ("The grand total is $" + taxPrice);
        System.out.println ("Enter amount tendered:");
        amountTendered = keyboard.nextDouble ();
        change = amountTendered - taxPrice;
        System.out.println ("Your change is $" + change);
    }
}