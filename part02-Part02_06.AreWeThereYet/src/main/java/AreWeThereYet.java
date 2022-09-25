
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int four = 1;

        while (true) {
            System.out.println("Give a number:");
            four = Integer.valueOf(scanner.nextLine());
            if (four == 4) {
                break;
            }

        }
    }
}
