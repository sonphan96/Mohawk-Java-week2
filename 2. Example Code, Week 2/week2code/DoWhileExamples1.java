
import java.util.Scanner;

/**
 * Comparison of While and Do While.
 *
 * What does each loop do?
 *
 * What value could the user enter to get the same output from each loop?
 *
 * What value to get a different output?
 *
 * @author Sam Scott
 */
public class DoWhileExamples1 {

    /**
     * @param args unused
   *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, userInput;

        System.out.print("Enter an integer: ");
        userInput = sc.nextInt();

        System.out.println("While");
        x = userInput;
        while (x < 10) {
            System.out.println(x);
            x++;
        }
        System.out.println(x);

        System.out.println("Do While");
        x = userInput;
        do {
            System.out.println(x);
            x++;
        } while (x < 10);
        System.out.println(x);

    }
}
