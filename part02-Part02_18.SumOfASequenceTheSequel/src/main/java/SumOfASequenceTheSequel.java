
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("First number?");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Last number?");
        int last = Integer.parseInt(scanner.nextLine());
        int total = 0;
        for (int i = first; i <= last; i++) {
            total += i;
        }
        System.out.println("The sum is " + total);
    }
}
