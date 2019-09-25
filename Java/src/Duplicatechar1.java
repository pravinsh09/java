import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Duplicatechar1 {
		
	

	
	public static void main(String[] args) {
		
		 StringBuilder builder = new StringBuilder();
		String str = "w3schools";
		
		HashSet<Character>  st = new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++){		
			st.add(str.charAt(i));
			
		}
		
		for(char c : st){
			
			System.out.println(builder.append(c));
		}
		
		
		
		
		
		System.out.println(builder);

	}
	
}
