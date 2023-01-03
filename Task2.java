//9.16. Дано слово. Определить, одинаковы ли второй и четвертый символы в нем
import java.util.Scanner;
class Task2{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Kez kelgen soz engiziniz");
		String word=in.nextLine();
		char c1=word.charAt(1);
		char c2=word.charAt(3);

		if(c1==c2){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
	}
}