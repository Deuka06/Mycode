//9.55. Дано предложение. 
//Составить программу, которая выводит все вхождения в предложение двух заданных символов.
import java.util.Scanner;
class Task55{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		char c1 = 'a';
		char c2 = 'o';
		
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			if(c == c1 || c==c2){
				System.out.println(i+": "+c);
			}
		}
	}
}