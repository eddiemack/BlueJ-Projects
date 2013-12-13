/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class EasterSunday
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int y,a,b,c,d,e,g,h,j,k,m,r,n,p;
        System.out.println ("What is the year?");
        y = keyboard.nextInt ();
        a = y % 19;
        b = y / 100;
        c = y % 100;
        d = b / 4;
        e = b % 4;
        g = (8 * b + 13) / 25;
        h = (19 * a + b - d - g + 15) % 30;
        j = c / 4;
        k = c % 4;
        m = (a + 11 * h) / 319;
        r = (2 * e + 2 * j - k - h + m + 32) % 7;
        n = (h - m + r + 90) / 25;
        p = (h - m + r + n + 19) % 25;
        if (n == 4)
        {
            System.out.println ("Easter Sunday falls on day " + p + " of April.");
        }
        else
        {
            System.out.println ("Easter Sunday falls on day " + p + " of March.");
        }
        System.out.println (e);
    }
}