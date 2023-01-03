 //9.37. Дано слово из четного числа букв. Поменять местами его половины. 
//Задачу решить двумя способами:
//1) без использования оператора цикла;
//2) с использованием оператора цикла.
 import java.util.Scanner;
   public class Task8 {
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           /*String word = in.nextLine();
           int length = word.length();
           String subword = word.substring(0, length / 2);
           String subword2 = word.substring(length / 2, length);
           System.out.println(subword2 + "" + subword);*/
            String word = in.nextLine();
            String f = "";
            String f2 = "";
            int half = word.length()/2;
            
            for(int i = 0; i < word.length()/2; i++){
                f = f + word.charAt(i);
                f2 = f2 + word.charAt(half+i);
            }
            System.out.println(f2+f);
       }
   }