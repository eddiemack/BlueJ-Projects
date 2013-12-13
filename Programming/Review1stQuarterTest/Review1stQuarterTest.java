/**
 * I have neither given nor received unauthorized aid on this assignment.
 * Acknowledgements:
 * Eddie Mack
 */
import java.util.*;
public class Review1stQuarterTest
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int age, birthYear, magicNumber, anotherNumber, strokes;
        double gpa, answer;
        String name;
        System.out.println ("Hello.");
        System.out.println ("Name?");
        name = keyboard.next ();
        if (name.equalsIgnoreCase ("Eddie"))
        {
            System.out.println ("You're awesome! Let's be best friends!");
        }
        else
        {
            System.out.println ("Ew! Get away from me!");
        }
        System.out.println ("Age?");
        age = keyboard.nextInt ();
        if (age == 13)
        {
            System.out.println ("I'm the same age!");
        }
        else
        {
            System.out.println ("You're weird!");
        }
        answer = 5.0/2.0;
        System.out.println ("Your answer is " + answer + ".");
        birthYear = 2012 - age;
        System.out.println ("Your birth year is " + birthYear + ".");
        magicNumber = (int) (Math.random () * 100) + 1;
        System.out.println ("Your number is " + magicNumber + ".");
        anotherNumber = 10 % 3;
        System.out.println ("Your other number is " + anotherNumber + ".");
        if (age<0)
        {
            System.out.println ("Wow you're stupid. You can't be a negative age!");
        }
        else
        {
            System.out.println ("That's a good age.");
        }
        System.out.println ("How many strokes did it take you to get the golf ball in the hole?");
        strokes = keyboard.nextInt ();
        if (strokes == 1)
        {
            System.out.println ("Hole in one!");
        }
        else
        {
            System.out.println ("Not a hole in one.");
        }
        if (age == 13 && name.equals ("Eddie") && gpa>3.0)
        {
            System.out.println ("Wow! We're the same!!!");
        }
        else
        {
            System.out.println ("Goodbye.");
        }
    }
}