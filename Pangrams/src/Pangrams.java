
public class Pangrams {
	public static boolean checkPanagram(String str) {
		if(str.length()<26){
			return false;
		}else {
			for(char c='a';c<='z';c++) {
				if(str.indexOf(c)<0) {
					return false;
				}
			}
		}
		return true;
		
	}

}
