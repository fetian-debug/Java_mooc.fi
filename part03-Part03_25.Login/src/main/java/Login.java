
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String inputName = scanner.nextLine();
        System.out.println("Enter password:");
        String inputPass = scanner.nextLine();

      
            if (inputName.equals("alex")) {

                if (inputPass.equals("sunshine")) {

                    System.out.println("You have successfully logged in!");
                   

                }

            }

            else if (inputName.equals("emma")) {

                if (inputPass.equals("haskell")) {

                    System.out.println("You have successfully logged in!");
                    

                }

            }
            
            else {
                System.out.println("Incorrect username or password!");
                
            }
        

    }
}
