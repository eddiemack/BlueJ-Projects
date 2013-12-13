
/**
 * Pair prompts the user for two numbers, then prints the sum, difference, product, average, distance, maximum, and minimum of the two numbers.
 * 
 * @author Eddie Mack 
 * @version 11/14/13
 */
public class Pair
{
    private double num1;
    private double num2;
    /**
     * Constructs a pair.
     * @param aFirst the first value of the pair.
     * @param aSecond the second value of the pair.
     */
    public Pair (double aFirst, double aSecond)
    {
        num1 = aFirst;
        num2 = aSecond;
    }
    
    /**
     * Computes the sum of the values of this pair.
     * @return the sum of the first and second values.
     */
    public double getSum()
    {
        return (num1 + num2);
    }
    
    /**
     * Computes the difference of the values of this pair.
     * @return the difference of the first and second values.
     */
    public double getDifference()
    {
        return (num1 - num2);
    }
    
    /**
     * Computes the product of the values of this pair.
     * @return the product of the first and second values.
     */
    public double getProduct()
    {
        return (num1 * num2);
    }
    
    /**
     * Computes the average of the values of this pair.
     * @return the average of the first and second values.
     */
    public double getAverage()
    {
        return (num1 + num2) / 2;
    }
    
    /**
     * Computes the distance of the values of this pair.
     * @return the distance of the first and second values.
     */
    public double getDistance()
    {
        if (getDifference() >= 0)
        {
            return (getDifference());
        }
        else
        {
            return (-getDifference());
        }
    }
    
    /**
     * Computes the maximum of the values of this pair.
     * @return the maximum of the first and second values.
     */
    public double getMaximum()
    {
        if (num1 >= num2)
        {
            return (num1);
        }
        else
        {
            return (num2);
        }
    }
    
    /**
     * Computes the minimum of the values of this pair.
     * @return the minimum of the first and second values.
     */
    public double getMinimum()
    {
        if (num1 <= num2)
        {
            return (num1);
        }
        else
        {
            return (num2);
        }
    }
}