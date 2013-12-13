import java.util.*;

public class RoachMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        int getRoaches, numberRoaches;
        String answer1, answer2;
        System.out.println ("How many roaches are in the population?");
        numberRoaches = keyboard.nextInt();
        RoachPopulation bed = new RoachPopulation (numberRoaches);
        System.out.println ("Do you want to breed the roaches? (y/n)");
        answer1 = keyboard.next();
        if (answer1.equals ("y"))
        {
            bed.breed();
        }
        System.out.println ("Do you want to spray the roaches with insecticide? (y/n)");
        answer2 = keyboard.next();
        if (answer2.equals ("y"))
        {
            bed.spray();
        }
        System.out.println ("You have " + bed.getRoaches() + " roaches left.");
    }
}