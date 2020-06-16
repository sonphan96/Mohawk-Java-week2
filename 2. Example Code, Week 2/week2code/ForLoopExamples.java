
import java.util.Scanner;

/**
 * Comparisons of For and While loops
 *
 * @author Sam Scott
 */
public class ForLoopExamples {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // *** Counting loop: FOR
        System.out.print("For count: ");

        for (int count = 1; count <= 10; count++) {
            System.out.print(count + " ");
        }

        System.out.println();

        // *** Counting loop: WHILE
        System.out.print("While count: ");

        int count = 1; // Why do we have to declare count again?
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }

        System.out.println();
    }
}
