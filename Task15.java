//9.109. Дано слово.
//а) Удалить из него третью букву.
//б) Удалить из него k-ю букву.
import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String soz = "HelloA";
        int k = sc.nextInt();
        char a;
        for ( int i = 0; i<soz.length(); i++) {
            a = soz.charAt(i);
            if (i==k-1){
                continue;
            }
            System.out.print(a);
        }
    }
}