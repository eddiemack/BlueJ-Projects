import java.util.*;

public class DataSetMain 
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double number;
        DataSet myNumbers = new DataSet ();
        System.out.println ("Enter a positive number. If you feel that you have entered enough numbers, then enter a negative number to stop.");
        number = keyboard.nextDouble();
        myNumbers.add(number);
        while (number >= 0)
        {
            number = keyboard.nextDouble();
            if (number > 0)
            {
                myNumbers.add(number);
            }
        }
        System.out.println ("The average of your numbers is " + myNumbers.getAverage() + ".");
        System.out.println ("The maximum number of your numbers is " + myNumbers.getMaximum() + ".");
    }
}