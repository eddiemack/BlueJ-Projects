/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements: Thanks to Edward Park for helping me with area.
 * Eddie Mack
 */

import java.util.*;

public class Triangle
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double height;
        System.out.println ("Input a height, in inches.");
        height = keyboard.nextDouble ();
        double base;
        System.out.println ("Input a base, in inches.");
        base = keyboard.nextDouble ();
        double area;
        area = 0.5 * base * height;
        System.out.println ("The area of your triangle is " + area);
    }
}
    