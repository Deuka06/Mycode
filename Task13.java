//9.90. Дано предложение. Все буквы е в нем заменить буквой и.
import java.util.Scanner;

public class Task13 {
 public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
  String soz = sc.nextLine();
  String soz1 = soz.replace('e','u');
  String soz2 = soz1.replace('E','U');
  System.out.println(soz2);

 }
}