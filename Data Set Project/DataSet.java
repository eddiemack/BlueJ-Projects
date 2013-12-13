
/**
 * Data Set asks the user to input numbers until the user enters a negative number, and outputs the average and the largest of all of the input numbers.
 * 
 * @author Eddie Mack
 * @version 12/3/13
 */
public class DataSet
{
    private int numNumbers;
    private double sumOfNumbers;
    private double maximumNum;
    public DataSet ()
    {
        numNumbers = 0;
        sumOfNumbers = 0;
        maximumNum = 0;
    }
    
    public void add (double number)
    {
        sumOfNumbers = number + sumOfNumbers;
        if (number > maximumNum)
        {
            maximumNum = number;
        }
        numNumbers = numNumbers + 1;
    }
    
    public double getAverage ()
    {
        return (sumOfNumbers / numNumbers);
    }
    
    public double getMaximum ()
    {
        return (maximumNum);
    }
}