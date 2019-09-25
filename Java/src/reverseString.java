
public class reverseString {

	public static void main(String[] args) {
		
		
		String rev="abcde";
		String reverse="";
		int length=rev.length();
		char c[]=rev.toCharArray();
		
		for(int i=length-1;i>=0;i--){
			
			reverse=reverse+c[i];
			
		}
		
		System.out.println(reverse);
		

	}

}
