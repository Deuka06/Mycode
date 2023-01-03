//9.21. Дано слово. Получить его часть, образованную второй, третьей и четвертой буквами.
import java.util.Scanner;
public class Task5{
    public static void main(String[] args) {
   Scanner in=new Scanner(System.in);
   String word=in.nextLine();
   char c1=word.charAt(1);
   char c2=word.charAt(2);
   char c3=word.charAt(3);
   System.out.println(c1+""+c2+""+c3);

   /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(print(str));
    }
    public static String print(String str){
        return str.substring(1,4);*/
    }
}