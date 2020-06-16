package week2code;

import java.util.Scanner;

/**
 * Basic example of Switch statement.
 *
 * @author Sam Scott
 */
public class Switch {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Say Something! (1 = Hello, 2 = Goodbye) ");
        int message = sc.nextInt();
        switch (message) {
            case 1:
                System.out.println("Hi");
                break;

            case 2:
                System.out.println("bye");
                break;

            default:
                System.out.println("?");
                break;
        }

    }
}
