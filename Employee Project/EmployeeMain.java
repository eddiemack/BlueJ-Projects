import java.util.*;

public class EmployeeMain
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String name;
        double salary, percent;
        System.out.println ("What is the name of your employee?");
        name = keyboard.next();
        System.out.println ("What is " + name + "'s salary?");
        salary = keyboard.nextDouble();
        Employee eddie = new Employee (name, salary);
        System.out.println ("The employee, " + name + ", will get $" + salary + " per year.");
        System.out.println ("How much do you want to raise his pay by?");
        percent = keyboard.nextDouble();
        eddie.raiseSalary(percent);
        System.out.println ("Okay, " + name + "'s new salary is $" + eddie.getSalary() + " per year.");
    }
}