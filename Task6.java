//9.22
//Дано слово, состоящее из четного числа букв. 
//Вывести на экран его первую половину, не используя оператор цикла.
import java.util.Scanner;
class Task6{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String word=in.nextLine();
		String subWord=word.substring(0,word.length()/2);
		System.out.println(subWord);
	}
}