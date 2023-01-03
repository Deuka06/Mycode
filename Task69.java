//9.69. Дан текст. Определить, сколько в нем предложений.
import java.util.Scanner;
public class Task69 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your text");
            String input = sc.nextLine();
            int count = 0;
 
            
            if(input.length() != 0){
                count++;
                
                for (int i = 0; i < input.length(); i++) {
                    if(input.charAt(i) == ' '){
                        
                        count++;
                    }
                }
            }
        System.out.println("You entered "+count+" word ");
    }
}