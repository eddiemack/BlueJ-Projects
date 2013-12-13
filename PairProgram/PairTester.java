import java.util.*;

public class PairTester
{
    public static void main (String [] args)
    {
        Pair numbers = new Pair (1, 2);
        System.out.println (numbers.getSum());
        System.out.println (numbers.getDifference());
        System.out.println (numbers.getProduct());
        System.out.println (numbers.getAverage());
        System.out.println (numbers.getDistance());
        System.out.println (numbers.getMaximum());
        System.out.println (numbers.getMinimum());
    }
}
    