
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int older = 0;

        while (true) {

            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] split = text.split(",");

            if (older < Integer.valueOf(split[1])) {
                older = Integer.valueOf(split[1]);
            }

        }

        System.out.println("Age of the oldest: "+ older);
    }
}
