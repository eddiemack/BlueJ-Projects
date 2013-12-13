public class StudentTester
{
    public static void main (String [] args)
    {
        Student marvin = new Student ("Marvin");
        System.out.println (marvin.getName());
        marvin.addQuiz(95);
        marvin.addQuiz(97);
        System.out.println (marvin.getTotalScore());
        System.out.println (marvin.getAverageScore());
    }
}