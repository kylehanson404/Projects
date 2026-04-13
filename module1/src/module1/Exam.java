package module1;
/**
   The Exam class extends the Assessment class.
   It determines the score based on the number
   of questions and how many were missed.
*/
public class Exam extends Assessment {

    private double pointsEach;  // Points per question

    /**
       Constructor
       @param questions Total number of questions
       @param missed Number of questions missed
    */
    public Exam(int questions, int missed) {

        // Calculate points per question
        pointsEach = 100.0 / questions;

        // Calculate score
        double numericScore = 100.0 - (missed * pointsEach);

        // Set score using parent class method
        setScore((int) numericScore);
    }

    /**
       Returns the points for each question
       @return pointsEach
    */
    public double getPointsEach() {
        return pointsEach;
    }
}