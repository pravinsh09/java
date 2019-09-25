

public class reversenumber {

	public static void main(String[] args) {
		
		int number=12345;
		String reverse="";
		String rev=Integer.toString(number);
		int len=rev.length();
		char c[]=rev.toCharArray();
		for(int i=len-1;i>=0;i--){
			
			 reverse=reverse+c[i];
		}
		
		System.out.println(Integer.parseInt(reverse));
		
	}

}
