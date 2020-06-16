
import java.util.Scanner;

/**
 * Comparison of While and Do While for input checking.
 *
 * Which do you like better? Why?
 *
 * @author Sam Scott
 */
public class DoWhileExamples2 {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        // while loop
        System.out.println("While: Enter a number from 1 to 10");
        number = sc.nextInt();

        while (number < 1 || number > 10) {
            System.err.println("Invalid range.");
            System.out.println("While: Enter a number from 1 to 10");
            number = sc.nextInt();
        }

        System.out.println("Thank you.");

        // do while loop
        do {
            System.out.println("Do While: Enter a number from 1 to 10");
            number = sc.nextInt();
            if (number < 1 || number > 10) {
                System.err.println("Invalid range.");
            }
        } while (number < 1 || number > 10);

        System.out.println("Thank you.");

    }
}
