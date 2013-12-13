/**
 * I have niether recieved nor given unauthorized aid.
 * Acknowledgements: Thanks to Edward Park for helping me with area.
 * Eddie Mack
 */
import java.util.*;

public class Rectangle
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double length;
        System.out.println ("Length in feet?");
        length = keyboard.nextDouble ();
        double width;
        System.out.println ("Width in feet?");
        width = keyboard.nextDouble ();
        double area;
        area = length * width;
        System.out.println ("The area of your rectangle is " + area);
        double perimeter;
        perimeter = 2 * length + 2 * width;
        System.out.println ("The perimeter of your rectangle is " + perimeter);
    }
}