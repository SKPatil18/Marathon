
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "World";
		
		System.out.println(str1+" "+str2);
		
		System.out.println(str1.concat(str2));
		String str3  = "java";
		System.out.println(str1.equals(str3));
		
		System.out.println(str1==str2);
		
		System.out.println(str1.codePointAt(0));
		
		System.out.println(str1.codePointBefore(1));

		System.out.println(str3.codePointCount(0, 3));
		
		System.out.println(str3.contains("ja"));
		
		System.out.println(str1.endsWith("o"));
		
		System.out.println(str2.startsWith("W"));
		
		System.out.println(str2.hashCode());
		
		String str4 = "World";
		
		System.out.println(str4.hashCode());
		
		System.out.println(str2.indent(1));
		
		System.out.println(str2.indexOf('d'));
		
		System.out.println(str2.intern());
		
		System.out.println(str2.isBlank());
		
		System.out.println(str2.isEmpty());
		
		System.out.println(str1.lastIndexOf('l'));
		
		System.out.println(str1.length());
		
		System.out.println(str2.repeat(2));
		
		System.out.println(str2.replace('W', 'w'));
		
		System.out.println(str2);
		
		String str5 = "java python";
		
		System.out.println(str5.strip());
		
		System.out.println(str5.toLowerCase());
		
		System.out.println(str5.toUpperCase());
		
		System.out.println(str5.trim());
		
		System.out.println(str5.substring(5));
		
		
		String st1= new String("Hello");
		String st2 = new String("Hello");
		
		System.out.println(st1.hashCode());
		System.out.println(st2.hashCode());
		
		System.out.println(st1.length());
		
		
		String str = "CodeWithJava";
		System.out.println(str.replace("a", ""));
		
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
		
		


		

	}

}
