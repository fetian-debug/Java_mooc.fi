
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        while(true){
            
            String text = scanner.nextLine();
            String[] split = text.split(" ");
            
            for (int i = 0; i < split.length; i++) {
                
                if(text.isEmpty()){
                    return;
                }else{
                    if(split[i].contains("av")){
                        System.out.println(split[i]);
                    }
                }
                
                
            }
         
            
            
        }
        


    }
}
