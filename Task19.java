//9.164. Дано предложение из 10 слов. Заполнить ими массив из 10 элементов.
import java.util.Scanner;
public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String soz = "aset yers Asset Yers";
        String soz1[] = soz.split(" ");

          for ( int i = 0; i<soz1.length; i++){
            System.out.println(soz1[i]);
        }
    }
}