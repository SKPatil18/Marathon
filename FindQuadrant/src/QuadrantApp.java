import java.util.Scanner;

public class QuadrantApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x and y :");
		int x = scan.nextInt();
		int y = scan.nextInt();
		Quadrant quad = new Quadrant();
		quad.findQuadrant(x, y);
		

	}

}
