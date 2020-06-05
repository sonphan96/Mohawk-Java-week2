import java.util.Scanner;

public class WhileLoopEx2 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        // While loop
        System.out.println("While: Enter a number from 1 to 10: ");
        number = sc.nextInt();

        while (number < 1 || number > 10){
            // Check condition
            System.err.println("Invalid range");
            System.out.println("While: Enter a number from 1 to 10");
            number = sc.nextInt();
        }
        System.out.println("Thank You");

        // Do while loop
        do {
            System.out.println("Do while: Enter a number from 1 to 10: ");
            number = sc.nextInt();
            if (number < 1 || number > 10) {
                System.err.println("Invalid range");
            }
        } while (number < 1 || number > 10);
        System.out.println("Thank you");

    }
}
