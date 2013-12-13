public class EmployeeTester
{
    public static void main (String [] args)
    {
        Employee eddie = new Employee ("John", 100);
        System.out.println (eddie.getName());
        eddie.raiseSalary(100);
        System.out.println (eddie.getSalary());
    }
}