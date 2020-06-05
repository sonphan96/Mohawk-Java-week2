import java.util.Scanner;

public class WhileLoopEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, userInput;

        System.out.print("Enter an integer: ");
        userInput = sc.nextInt();

        System.out.println("While");
        x = userInput;
        while (x < 10){
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
