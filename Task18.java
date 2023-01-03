//9.151. Дан текст. Найти максимальное из имеющихся в нем чисел
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String soz = "0HelloAaAa4a3a. I am1 Asset. I a9m 7 yo.";
        int ar[] = new int[soz.length()];
        int max = 0;
        char a;
        int l;
        for ( int i = 0; i<soz.length(); i++) {
            a = soz.charAt(i);
            l = Character.digit(a,10);
            if (l>=0 && l<=9){
                ar[i] = l;
            }
        }
        for (int i = 0; i<soz.length(); i++){
            if (max<ar[i]) max = ar[i];
        }
        System.out.println(max);
    }
}    