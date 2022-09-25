
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


          
          String Name ="";
          int avgAge=0;
          double sum=0;
          double avg=0;
          double count=0;
          int lengestName=0;

        while (true) {

            String text = scanner.nextLine();

            if (text.isEmpty()) {
                break;
            }

            String[] split = text.split(",");
            sum = sum+ Integer.valueOf(split[1]);
            count++;
            
            
            if (lengestName < split[0].length()) {
                lengestName= split[0].length();
                Name = split[0] ;
                
                
            }

        }

        avg = sum/count;
        System.out.println("Longest name: "+ Name);
        System.out.println("Average of the birth years: "+avg);
       
    }
}
