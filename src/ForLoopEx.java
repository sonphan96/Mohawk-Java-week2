import java.util.Scanner;

public class ForLoopEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Counting loop: For
        System.out.print("For count: ");

        for (int count = 1; count <= 10; count++){
            System.out.println(count + " ");
        }

        System.out.println();

        // Counting loop : While

        System.out.print("While count: ");

        int count = 1;

        while (count <= 10){
            System.out.print(count + " ");
            count ++;
        }

        System.out.println();
    }
}

