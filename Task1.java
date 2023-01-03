//9.13. Дано слово. Вывести на экран его третий символ.
import java.util.Scanner;
class Task1{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Kez kelgen soz engiziniz");
		String word=in.nextLine();
		char c=word.charAt(2);
		System.out.println(c);
	}
}