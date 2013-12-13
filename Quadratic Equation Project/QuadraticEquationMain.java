import java.util.*;

public class QuadraticEquationMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double a, b, c;
        System.out.println ("Enter 3 variables.");
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        c = keyboard.nextDouble();
        QuadraticEquation qE = new QuadraticEquation (a, b, c);
        if (qE.hasSolutions())
        {
            System.out.println ("The first solution is " + qE.getSolution1() + ".");
            System.out.println ("The second solution is " + qE.getSolution2() + ".");
        }
    }
}