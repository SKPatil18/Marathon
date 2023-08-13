import java.util.Scanner;

public class VendingMachineSimulatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter code");
		String code = scan.next();
		getProduct(code);

	}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "po1":System.out.println("CoCa CoLa");
		break;
		case "po2":System.out.println("Pepsi");
		break;
		case "po3":System.out.println("Bindu");
		break;
		default: System.out.println("Maza");
		}
	}

}
