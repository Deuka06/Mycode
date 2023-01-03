//9.17. Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же букву?
import java.util.Scanner;
class Task3{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Kez kelgen soz engiziniz");
		String word=in.nextLine();
		char c1=word.charAt(0);
		char c2=word.charAt(word.length()-1);

		if(c1==c2){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
	}
}