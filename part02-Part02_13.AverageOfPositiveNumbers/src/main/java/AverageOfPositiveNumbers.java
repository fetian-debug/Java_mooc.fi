
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double count = 0;
        while (true) {
            System.out.println("Give a number:");
            double num = Double.valueOf(scanner.nextLine());

            if (num > 0) {
                count = count + 1.0;
                sum = num + sum;
            }

            if (num == 0) {
                break;
            }

        }
        if (count <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = (sum / count);
            System.out.println("Average of the numbers: " + avg);
        }
    }
}
