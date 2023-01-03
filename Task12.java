//9.76. Дано предложение, в котором имеется несколько букв е. Найти:
//а) порядковый номер первой из них;
//б) порядковый номер последней из них.
import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String soz = "HlleoAaeAaee";
        String soz1 = soz.toLowerCase();
        int sum = 0;
        char a;
        /* for ( int i = 0; i<soz.length(); i++) {
                a = soz1.charAt(i);
                if (a == 'e'){
                    sum = i;
                    break;
                }
            }
        System.out.println(sum+1);*/

        for ( int i = 0; i<soz.length(); i++) {
            a = soz1.charAt(i);
            if (a == 'e'){
                sum = i;
            }
        }
        System.out.println(sum+1);
    }
}