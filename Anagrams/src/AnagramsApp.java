import java.util.Scanner;

public class AnagramsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two Strings :");
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		boolean result = Anagram.checkAnagram(str1, str2);
		System.out.println(result?"Anagrams":"Not Anagrams");
		

	}

}
