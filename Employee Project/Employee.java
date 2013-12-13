
/**
 * Employee allows you to become the boss. You have an employee (of which you choose his name), and you can choose to raise his salary.
 * 
 * @author Eddie Mack 
 * @version 11/6/13
 */
public class Employee
{
    private String name;
    private double salary;
    /**
     * Constructs the employee.
     * @param name Prompts the user to enter a name for the employee.
     * @param currentSalary Prompts the user to enter the employee's starting salary.
     */
    public Employee (String employeeName, double currentSalary)
    {
        salary = currentSalary;
        name = employeeName;
    }
    
    /**
     * Prompts user for a name for the employee.
     * @return employeeName The name of the employee.
     */
    public String getName ()
    {
        return (name);
    }
    
    /**
     * Prompts the user for a salary for the employee.
     * @return the current salary of the employee.
     */
    public double getSalary ()
    {
        return (salary);
    }
    
    /**
     * Prompts the user to raise the employee's salary.
     * @param byPercent Choose what percent by which you will increase the employee's salary.
     */
    public void raiseSalary (double byPercent)
    {
        salary = salary * ((byPercent / 100) + 1);
    }
}