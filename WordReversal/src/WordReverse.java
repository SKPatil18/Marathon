
public class WordReverse {
	public static String reverseString(String str) {
		String[] s = str.split(" ");
		String rev ="";
		
		for(int i=s.length-1;i>=0;i--) {
			if(i==0) {
				rev=rev+s[i];
			}else {
				rev=rev+s[i]+" ";
			}
		}
		
		return rev;
		
	}

}
