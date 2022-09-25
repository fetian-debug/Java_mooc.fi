
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          int older = 0;
          String NameOfOlder="";

        while (true) {

            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] split = text.split(",");
           
            
            if (older < Integer.valueOf(split[1])) {
                older = Integer.valueOf(split[1]);
                
                NameOfOlder = split[0];
            }

        }

        System.out.println("Name of the oldest: "+ NameOfOlder);
    }
}
