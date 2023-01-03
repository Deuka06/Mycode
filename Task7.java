//9.25. Из слова информатика путем "вырезок" и "склеек" его букв получить слова форма и тик. 
class Task7{
	public static void main(String[] args) {
		String word="informatics";
		String subWord1 = word.substring(2,6);
		String subWord2 = word.substring(7,10);
		System.out.print(subWord1);
		System.out.print(subWord2);
	}
} 