//9.112. Дано предложение. 
//Удалить из него все символы с n1-го по n2-й (n1 n2).
import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String soz = "HelloA";
        int k = sc.nextInt();
        int l = sc.nextInt();
        char a;
        for ( int i = 0; i<soz.length(); i++) {
            a = soz.charAt(i);
            if (i>k-1 && i<l-1){
                continue;
            }
            System.out.print(a);
        }
    }
}