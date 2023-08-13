import java.util.Scanner;

public class CharactorIdentifierApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = scan.next().charAt(0);
		charactorIdentifier(c);
		
	}
	public static void charactorIdentifier(char c) {
		//System.out.println(ch);
		//Character c = new Character(ch);
		//System.out.println(Character.isLowerCase(c));
		if(Character.isLowerCase(c)) {
			if(c=='a' || c == 'e' || c == 'i' || c == 'o'|| c=='u') {
				System.out.println("Lower-case vowel");
			}else {
				System.out.println("Lower-case Consonent");
			}
		}else if(Character.isUpperCase(c)) {
			if(c=='A' || c == 'E' || c == 'I' || c == 'O'|| c=='U') {
				System.out.println("Upper-case vowel");
			}else {
				System.out.println("Upper-case Consonent");
			}
		}else if(Character.isDigit(c)){
			System.out.println("Entered value is a Integer");
		}
		else {
			System.out.println("Entered Character is a Special Character");
		}
		
		
		
	}

}
