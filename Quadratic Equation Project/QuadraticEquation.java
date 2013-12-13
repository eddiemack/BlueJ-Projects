
/**
 * Quadratic Equation uses the user-input variables in the quadratic equation to find the answer.
 * 
 * @author Eddie Mack
 * @version 11/20/13
 */
public class QuadraticEquation
{
    private double alpha;
    private double beta;
    private double charlie;
    /**
     * Constructs the quadratic equation.
     * @param a The first variable in the equation.
     * @param b The second variable in the equation.
     * @param c The third variable in the equation.
     */
    public QuadraticEquation (double a, double b, double c)
    {
        alpha = a;
        beta = b;
        charlie = c;
    }
    
    /**
     * Gets the solution using the quadratic formula.
     */
    public double getSolution1 ()
    {
        return ((-beta + Math.sqrt (((beta * beta) - (4 * alpha * charlie)))) / (2 * alpha));
    }
    
    /**
     * Gets the solution using the quadratic formula.
     */
    public double getSolution2 ()
    {
        return ((-beta - Math.sqrt (((beta * beta) - (4 * alpha * charlie)))) / (2 * alpha));
    }
    
    /**
     * Returns true if the discriminant is positive or false if the discriminant is negative.
     */
    public boolean hasSolutions ()
    {
        if (beta * beta - 4 * alpha * charlie < 0)
        {
            return (false);
        }
        else
        {
            return (true);
        }
    }
}