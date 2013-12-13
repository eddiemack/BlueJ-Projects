
/**
 * Interest allows the user to input an amount of money and the interest rate and Interest calculates the money after x number of years.
 * 
 * @author Eddie Mack
 * @version 11/26/13
 */
public class Investment
{
    private double amount;
    private double interestRate;
    private int years;
    private double milestone;
    public Investment (double money, double interest)
    {
        amount = money;
        interestRate = interest;
        years = 0;
    }
    
    public void waitForBalance (double milestone)
    {
        while (amount <= milestone)
        {
            amount = amount * ((interestRate / 100) + 1);
            years = years + 1;
        }
    }
    
    public int getYears ()
    {
        return (years);
    }
}