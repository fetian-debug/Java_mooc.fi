
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String no = "";

        while (!no.equals("no")) {
            System.out.println("Shall we carry on?");
            no = scanner.nextLine();

        }
    }
}
