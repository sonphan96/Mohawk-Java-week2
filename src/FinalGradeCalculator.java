import javax.swing.*;
import java.awt.*;

public class FinalGradeCalculator {
    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        // Gather input from user
        String input1 = JOptionPane.showInputDialog("Enter the student's course grade: ");
        double grade = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Enter the student's exam grade: ");
        double examGrade = Double.parseDouble(input2);

        if(grade < 0 || grade > 100 || examGrade < 0 || examGrade > 100)
        {
            JOptionPane.showMessageDialog(null,
                    "Invalid number entered, grade must be between 0 and 100");
        }
        else
        {
            if(examGrade < 50 || grade < 50)
            {
                JOptionPane.showMessageDialog(null,
                        "Student has failed the course!");
            }
            else if (examGrade > grade)
            {
                JOptionPane.showMessageDialog(null,
                        "Student's grade is: " + examGrade);
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                        "Student's grade is: " + grade);
            }
        }
    }
}
