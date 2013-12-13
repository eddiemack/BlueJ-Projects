import java.util.*;

public class RoachSimulation
{
    public static void main (String [] args)
    {
        RoachPopulation bed = new RoachPopulation (10);
        bed.breed();
        bed.spray();
        System.out.println (bed.getRoaches());
        bed.breed();
        bed.spray();
        System.out.println (bed.getRoaches());
        bed.breed();
        bed.spray();
        System.out.println (bed.getRoaches());
    }
}