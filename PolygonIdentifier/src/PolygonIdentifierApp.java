import java.util.Scanner;

public class PolygonIdentifierApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sides of a polygon");
		int sides = scan.nextInt();
		identifyPolygon(sides);
	}
	public static void identifyPolygon(int sides) {
		if(sides == 3) {
			System.out.println("Triangle");
		}
		else if(sides == 4) {
			System.out.println("Quadrilateral");
		}
		else if(sides == 5) {
			System.out.println("Pentagon");
		}
		else if(sides == 6) {
			System.out.println("Hexagon");
		}
		else if(sides == 7) {
			System.out.println("Heptagon");
		}
	}
}
