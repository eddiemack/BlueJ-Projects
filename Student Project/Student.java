
/**
 * Write a description of class Student here.
 * 
 * @author Eddie Mack
 * @version 11/8/13
 */
public class Student
{
    private String name;
    private double total;
    private int numQuiz;
    /**
     * The name of the student.
     * @param name Name of the student.
     */
    public Student (String studentName)
    {
        name = studentName;
        total = 0;
        numQuiz = 0;
    }
    
    /**
     * Prompts the user for the name of the student.
     * @return the name of the student.
     */
    public String getName ()
    {
        return (name);
    }
    
    /**
     * Add the score of a quiz to the total sum of the quiz scores.
     * @param score The score of the quiz.
     */
    public void addQuiz (int score)
    {
        total = total + score;
        numQuiz = numQuiz + 1;
    }
    
    /**
     * Gets the total score of all quizzes.
     * @return The total score of all of the quizzes.
     */
    public double getTotalScore ()
    {
        return (total);
    }
    
    /**
     * Gets the average score of all of the quizzes.
     * @return The average score of all of the quizzes.
     */
    public double getAverageScore ()
    {
        return (total / numQuiz);
    }
}