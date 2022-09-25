
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Double> numbers = new ArrayList<>();

        while (true) {
            double input = Double.valueOf(scanner.nextLine());
           

            if (input == -1) {
                break;
            }
            numbers.add(input);

        }
        double sum = 0.0;
        double avg = 0.0;
        for (double num : numbers) {
            sum = num + sum;

        }

        avg = sum / (numbers.size());

        System.out.println("Average: " + avg);
        
    }
}
