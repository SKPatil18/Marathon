import java.util.Arrays;

public class Anagram {
	public static boolean checkAnagram(String s1,String s2) {
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);		
		
		if(Arrays.equals(str1, str2)) {
			return true;
		}else {
			return false;
		}
		
	}

}
