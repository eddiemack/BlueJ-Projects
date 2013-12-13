/**\
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */

import java.util.*;

public class Circle
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double radius;
        System.out.println ("Enter a radius in inches.");
        radius = keyboard.nextDouble ();
        double circumference;
        circumference = 2 * Math.PI * radius;
        System.out.println (" The circumference of your circle is " + circumference);
        double area;
        area = Math.PI * (radius * radius);
        System.out.println ("The area of your circle is " + area);
    }
}