package week2code;

import java.util.Scanner;

/**
 * Uncomment the last few lines to see the Syntax error. Now fix it!
 *
 * Java scope rules. A variable is accessible: 1. after it is declared, and 2.
 * within its code block.
 *
 * @author Sam Scott
 */
public class ScopeExercise2 {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick an int!");
        int num = sc.nextInt();
        if (num == 7) {
            boolean seven = true;
            System.out.println("I like that number!");
        } else {
            boolean seven = false;
            System.out.println("OK, we'll go with that.");
        }

        int count = 1;
        while (count <= num) {
            int timestwo = num * 2;
            System.out.println(count);
            count++;
        }
        
//        if (seven && timestwo == 14) {
//            System.out.println("That was great!");
//        }
    }
}
