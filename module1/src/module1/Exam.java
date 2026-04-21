import javax.swing.JOptionPane;

public class TestScores {
    public static void main(String[] args) {

        try {
            String inputQuestions = JOptionPane.showInputDialog("Enter number of questions:");
            int questions = Integer.parseInt(inputQuestions);

            String inputMissed = JOptionPane.showInputDialog("Enter number missed:");
            int missed = Integer.parseInt(inputMissed);

            Exam exam = new Exam(questions, missed);

            JOptionPane.showMessageDialog(null,
                "Each question is worth " + exam.getPointsEach() + " points\n" +
                "Score: " + exam.getScore() + "\n" +
                "Grade: " + exam.getGrade());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Enter numbers only.");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: Questions cannot be zero.");
        }
    }
}