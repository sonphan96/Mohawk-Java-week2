package week2code;

/**
 * Uncomment the last line to see the Syntax error. Now fix it!
 *
 * Java scope rules. A variable is accessible: 1. after it is declared, and 2.
 * within its code block.
 *
 * @author Sam Scott
 */
public class ScopeExercise {

    /**
     * @param args unused
     */
    public static void main(String[] args) {
        int count = 10;
        while (count >= 1) {
            int show = count * 2;
            System.out.println(show);
            count -= 1;
        }
        System.out.println("blast off");
        //System.out.println(show);
    }
}
