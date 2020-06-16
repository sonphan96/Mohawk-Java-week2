
import java.util.Scanner;

/**
 * Example of String Comparisons.
 *
 * @author Sam Scott
 * @author Daniel Liang
 */
public class ComparingStrings {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Say Hello");
        String userInput = sc.nextLine();

        // try the different versions of the if below...
        if (userInput == "Hello") {
        //if (userInput.equals("Hello")) {
        //if (userInput.equalsIgnoreCase("Hello")) {
        //if (userInput.startsWith("Hello")) {
        //if (userInput.toLowerCase().compareTo("hello") == 0) {
            System.out.println("You said hello!");
        }

    }
}
