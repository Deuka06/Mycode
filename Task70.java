//9.70. Дано предложение. Определить, сколько в нем гласных букв.
import java.util.Scanner;
public class Task70 {
    public static void main(String[] args) {

        
        /*String stringToProc= "how many vowels letters";
        char[] vocalArr = new char[]{'a','e','y','u','i',};
        int counter = 0;
        char[] arrayToProc = stringToProc.toCharArray();

        for (char ch : arrayToProc) {
            for (char ch2 : vocalArr) {
                if (ch == ch2){
                    counter++;
                }
            }
        }
        System.out.println(counter);*/
        
        Scanner in = new Scanner(System.in);
        String word =in.nextLine();
        char vowels[] = {'e','y','u','i','o','a'};
        word = word.toLowerCase();
        int count = 0;

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);

            for(int j = 0; j < vowels.length; j++){
                if(c == vowels[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}