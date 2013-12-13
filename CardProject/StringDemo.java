import java.util.*;

public class StringDemo
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String yourName, firstName, nickName;
        firstName = "alexander";
        nickName = firstName.substring (3, 9);
        System.out.println (nickName);
        System.out.println ("What's your first name?");
        yourName = keyboard.next();
        System.out.println ("Hi, " + yourName);
        System.out.println (yourName.length() + " letters!");
    }
}