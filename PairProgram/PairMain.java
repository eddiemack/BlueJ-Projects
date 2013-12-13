import java.util.*;

public class PairMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double num1, num2;
        System.out.println ("Please put in two positive numbers.");
        num1 = keyboard.nextDouble();
        num2 = keyboard.nextDouble();
        Pair numbers = new Pair (num1, num2);
        System.out.println ("The sum of " + num1 + " & " + num2 + " is " + numbers.getSum() + ".");
        System.out.println ("The difference of " + num1 + " & " + num2 + " is " + numbers.getDifference() + ".");
        System.out.println ("The product of " + num1 + " & " + num2 + " is " + numbers.getProduct() + ".");
        System.out.println ("The average of " + num1 + " & " + num2 + " is " + numbers.getAverage() + ".");
        System.out.println ("The distance of " + num1 + " & " + num2 + " is " + numbers.getDistance() + ".");
        System.out.println ("The maximum of " + num1 + " & " + num2 + " is " + numbers.getMaximum() + ".");
        System.out.println ("The minimum of " + num1 + " & " + num2 + " is " + numbers.getMinimum() + ".");
    }
}