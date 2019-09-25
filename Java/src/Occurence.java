import java.util.HashMap;
import java.util.Set;

public class Occurence {

	public static void main(String[] args) {
		
		
		String str="testingistdone";
		HashMap <Character, Integer> hMap = new HashMap<>();
				
		char[] c =str.toCharArray();
		
		for(int i=0;i<c.length;i++){
			
			if(hMap.containsKey(c[i])){
				int count = hMap.get(c[i]);				
				hMap.put(c[i], ++count);
			}else{
				
				hMap.put(c[i], 1);
			}
			
		}
		
		System.out.println(hMap.keySet());
		
	}
	
	
   
     
     // Getting values from HashMap
     
     
}
