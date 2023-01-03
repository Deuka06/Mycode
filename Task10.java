//9.42. Составить программу, которая печатает заданное слово, начиная с последней буквы.
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char b;
        
        for ( int i = word.length()-1; i>=0; i-- ) {
            b = word .charAt(i);
            System.out.print(b);
        }
    }
}