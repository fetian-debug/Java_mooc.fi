
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;
        while (true) {
            System.out.println("Give a number:");
            double num = Double.valueOf(scanner.nextLine());
            count = count + 1.0;

            sum = num + sum;

            if (num == 0) {
                break;
            }

        }
        double avg = (sum / (count - 1));
        System.out.println("Average of the numbers: " + avg);

    }
}
