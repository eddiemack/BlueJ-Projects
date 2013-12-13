import java.util.*;

public class SodaCanMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        double height, diameter;
        System.out.println ("What is the height of your soda can?");
        height = keyboard.nextDouble ();
        System.out.println ("What is the diameter of your soda can?");
        diameter = keyboard.nextDouble ();
        SodaCan can = new SodaCan (height, diameter);
        System.out.println ("The volume of the soda can is " + can.getVolume() + ".");
        System.out.println ("The surface area of the soda can is " + can.getSurfaceArea() + ".");
    }
}