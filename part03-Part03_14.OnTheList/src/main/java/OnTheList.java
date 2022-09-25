
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void searchTerm(ArrayList<String> list, String search) {

        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for?");
        String search = scanner.nextLine();
        searchTerm(list, search);

    }
}
