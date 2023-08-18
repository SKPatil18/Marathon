
public class PangramsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "The quick brown fox jumps over the lazy dog.";
		boolean res = Pangrams.checkPanagram(str.toLowerCase());
		System.out.println(res);
	}

}
