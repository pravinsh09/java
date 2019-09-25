package code;

public class string1 {

	public static void main(String[] args) {
		
		
		String str = "Hello World";
		str = "Hi World!";
		
		//String appe =str.concat("abcd");
		System.out.println(str);
		System.out.println(str+"test");
		System.out.println(str.concat("contenate"));
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
		
	}

}
