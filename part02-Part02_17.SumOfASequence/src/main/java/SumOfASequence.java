
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Last number?");
        int last = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = 0; i <= last; i++) {
            total += i;
        }
        System.out.println("The sum is " + total);

    }
}
