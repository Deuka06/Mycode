//9.92. Дано предложение. Все его символы, стоящие на четных местах, заменить 
import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String soz = "HelloA";
        char a;
        for ( int i = 0; i<soz.length(); i++) {
            a = soz.charAt(i);
            if (i%2==0){
                a='y';
            }
            System.out.print(a);
        }
    }
}