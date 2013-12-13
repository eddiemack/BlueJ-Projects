
import java.util.*;
public class Password
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String password;
        do
        {
            System.out.println ("Enter the password.");
            password = keyboard.next ();
            if (!password.equals ("happiness") && (!password.equals ("tron")))
            {
                System.out.println ("Sorry, try again.");
            }
        }
        while (!password.equals ("happiness") && (!password.equals ("tron")));
        System.out.println ("You may enter the system.");
       
    }
}