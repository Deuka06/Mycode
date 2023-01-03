//9.49. Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.
import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String word = in.next();
        
        for ( int i = 0; i<word.length(); i++) {
            System.out.print("*");
        }
        System.out.print(word);
        for ( int i = 0; i<word.length(); i++) {
            System.out.print("*");
        }
    }
}