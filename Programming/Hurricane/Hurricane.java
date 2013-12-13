/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgments:
 * Eddie Mack
 */
import java.util.*;
public class Hurricane
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int windSpeed;
        String name;
        System.out.println ("What is the name of the hurricane?");
        name = keyboard.next ();
        System.out.println ("What is the wind speed of hurricane " + name + "?");
        windSpeed = keyboard.nextInt ();
        if (windSpeed< 74)
        {
            System.out.println ("IT'S JUST WIND CALM THE HECK DOWN.");
        }
        else if (windSpeed< 95)
        {
            System.out.println ("IT'S JUST A CATEGORY 1. NOT A BIG DEAL.");
        }
        else if (windSpeed< 110)
        {
            System.out.println ("Hurricane " + name + " is a Category 2 hurricane.");
        }
        else if (windSpeed< 130)
        {
            System.out.println ("Get to shelter you have a Category 3 hurricane on your hands.");
        }
        else if (windSpeed< 155)
        {
            System.out.println ("This is getting bad get to somewhere safe with supplies.");
        }
        else
        {
            System.out.println ("EVACUATE NOW THIS IS HUGE!!!!!");
        }
    }
}