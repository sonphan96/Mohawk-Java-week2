
import java.util.Scanner;

/**
 * As of Java 7, the switch statement works on Strings. In the
 * background, it uses the .equals method to evaluate each case.
 *
 * Sam Scott, 2015
 */
public class SwitchStrings {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Say Something!");
        String s = sc.nextLine();
        switch (s) {
            case "Hello":
                System.out.println("Hi");
                break;

            case "Goodbye":
                System.out.println("bye");
                break;

            default:
                System.out.println("?");
                break;
        }
    }
}
