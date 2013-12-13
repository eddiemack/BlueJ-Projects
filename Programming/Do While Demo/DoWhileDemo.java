import java.util.*;
public class DoWhileDemo
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int age;
        do
        {
            System.out.println ("How old are you?");
            age = keyboard.nextInt ();
        }
        while (age <= 0);
        System.out.println ("Thank you.");
    }
}