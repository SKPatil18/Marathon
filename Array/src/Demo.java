import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of person");
		int num =scan.nextInt();
		boolean str[] = new boolean[num];

		for(int i=0;i<=str.length-1;i++) {
			System.out.println("Enter marriage status for person "+(i+1));
			str[i]=scan.nextBoolean();
		}
		for(int i=0;i<=str.length-1;i++) {
			System.out.println("Person "+(i+1)+" is "+str[i]);
		}
		
	}

}
