
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] split = text.split(" ");
            
            if(text.isEmpty()){
                break;
            }else{
            
            System.out.println(split[0]);
        }
        }
    }
}
