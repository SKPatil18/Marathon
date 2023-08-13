import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a String :");
//		StringBuffer sb = new StringBuffer(scan.next());
//		for(int i=0;i<sb.length()/2;i++) {
//			int front = i;
//			int back = sb.length()-1-i;
//			
//			char frontChar = sb.charAt(front);
//			char backChar = sb.charAt(back);
//			
//			sb.setCharAt(front, backChar);
//			sb.setCharAt(back, frontChar);
//		}
//		System.out.println(sb);
//		
//		String res = "";
//		for(int i=0;i<sb.length();i++) {
//			res = res + sb.charAt(i);
//		}
//		System.out.println(res);
		
		String str = "JAVA";
		String rstr = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(str.length()-1-i);
			rstr = rstr + c;
		}
		System.out.println(rstr);
		

	}

}
