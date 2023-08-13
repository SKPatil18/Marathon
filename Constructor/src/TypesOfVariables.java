
public class TypesOfVariables {
	static int a = 10;//static variables
	int c =30; //instance variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=20;//local variables
		System.out.println(a);
		System.out.println(b);
		TypesOfVariables obj = new TypesOfVariables();
		System.out.println(obj.c);
	}

}
