
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.charAt(0));
		System.out.println(sb.charAt(2));
		System.out.println(sb.insert(0, 'h'));
		sb.setCharAt(0, 'A');
		System.out.println(sb);
		System.out.println(sb.append('S'));
		
		String str = "HELLO";
		if(str.compareTo(new String("HELLO"))==0) {
			System.out.println("Strings are equal");
		}
		if(str==str) {
			System.out.println("Strings are equal");
		}
		
		System.out.println(sb.reverse());
		StringBuffer sb1 = new StringBuffer("Hello");

		
		for(int i=sb1.length()-1; i>=0;i--) {
			System.out.print(sb1.charAt(i));
		}


	}

}
