//9.62. Дано предложение. Определить долю (в %) букв а в нем.
import java.util.Scanner;
class Task62{
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        String word = in.next(); //helloa
        String a1 = word.toLowerCase();
        String a2 = a1.replace(" ","");
        int count = 0;
        
        for(int i = 0; i < a2.length(); i++){
       		if(a2.charAt(i) == 'a'){
           	count++;
       		}
        }
        System.out.println((float) (100*count)/a2.length()+"%");
    }
}